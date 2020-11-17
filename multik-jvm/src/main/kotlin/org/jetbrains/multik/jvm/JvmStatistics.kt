package org.jetbrains.multik.jvm

import org.jetbrains.multik.api.Statistics
import org.jetbrains.multik.ndarray.data.*
import org.jetbrains.multik.ndarray.operations.div

public object JvmStatistics : Statistics {
    override fun <T : Number, D : Dimension> median(a: MultiArray<T, D>): Double {
        //TODO("Sort")
        TODO("Not yet implemented")
    }

    override fun <T : Number, D : Dimension> average(a: MultiArray<T, D>, weights: MultiArray<T, D>?): T {
        TODO("Not yet implemented")
    }

    override fun <T : Number, D : Dimension> mean(a: MultiArray<T, D>): Double {
        val ret = JvmMath.sum(a)
        return ret.toDouble() / a.size
    }

    override fun <T : Number, D : Dimension, O : Dimension> mean(a: MultiArray<T, D>, axis: Int): Ndarray<Double, O> {
        require(a.dim.d > 1) { "Ndarray of dimension one, use the `mean` function without axis." }
        require(axis in 0 until a.dim.d) { "axis $axis is out of bounds for this ndarray of dimension ${a.dim.d}." }
        val newShape = a.shape.remove(axis)
        val retData = initMemoryView<Double>(newShape.fold(1, Int::times), DataType.DoubleDataType)
        val indexMap: MutableMap<Int, Indexing> = mutableMapOf()
        for (i in a.shape.indices) {
            if (i == axis) continue
            indexMap[i] = 0.r..a.shape[i]
        }
        for (index in 0 until a.shape[axis]) {
            indexMap[axis] = index.r
            val t = a.slice<T, D, O>(indexMap)
            var count = 0
            for (element in t) {
                retData[count++] += element.toDouble()
            }
        }

        return Ndarray<Double, O>(
            retData, 0, newShape, dtype = DataType.DoubleDataType, dim = dimensionOf(newShape.size)
        ) / a.shape[axis].toDouble()
    }

    override fun <T : Number> meanD2(a: MultiArray<T, D2>, axis: Int): Ndarray<Double, D1> = mean(a, axis)

    override fun <T : Number> meanD3(a: MultiArray<T, D3>, axis: Int): Ndarray<Double, D2> = mean(a, axis)

    override fun <T : Number> meanD4(a: MultiArray<T, D4>, axis: Int): Ndarray<Double, D3> = mean(a, axis)

    override fun <T : Number> meanDN(a: MultiArray<T, DN>, axis: Int): Ndarray<Double, D4> = mean(a, axis)
}
