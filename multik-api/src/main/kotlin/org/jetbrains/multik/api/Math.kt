package org.jetbrains.multik.api

import org.jetbrains.multik.ndarray.data.*

/**
 * Mathematical methods interface.
 */
public interface Math {

    /**
     * Returns flat index of maximum element in a ndarray.
     */
    public fun <T : Number, D : Dimension> argMax(a: MultiArray<T, D>): Int

    /**
     *
     */
    public fun <T : Number, D : Dimension, O: Dimension> argMax(a: MultiArray<T, D>, axis: Int): Ndarray<Int, O>

    /**
     *
     */
    public fun <T : Number> argMaxD2(a: MultiArray<T, D2>, axis: Int): Ndarray<Int, D1>

    /**
     *
     */
    public fun <T : Number> argMaxD3(a: MultiArray<T, D3>, axis: Int): Ndarray<Int, D2>

    /**
     *
     */
    public fun <T : Number> argMaxD4(a: MultiArray<T, D4>, axis: Int): Ndarray<Int, D3>

    /**
     *
     */
    public fun <T : Number> argMaxDN(a: MultiArray<T, DN>, axis: Int): Ndarray<Int, D4>

    /**
     * Returns flat index of minimum element in a ndarray.
     */
    public fun <T : Number, D : Dimension> argMin(a: MultiArray<T, D>): Int

    /**
     *
     */
    public fun <T : Number, D : Dimension, O: Dimension> argMin(a: MultiArray<T, D>, axis: Int): Ndarray<Int, O>

    /**
     *
     */
    public fun <T : Number> argMinD2(a: MultiArray<T, D2>, axis: Int): Ndarray<Int, D1>

    /**
     *
     */
    public fun <T : Number> argMinD3(a: MultiArray<T, D3>, axis: Int): Ndarray<Int, D2>

    /**
     *
     */
    public fun <T : Number> argMinD4(a: MultiArray<T, D4>, axis: Int): Ndarray<Int, D3>

    /**
     *
     */
    public fun <T : Number> argMinDN(a: MultiArray<T, DN>, axis: Int): Ndarray<Int, D4>

    /**
     * Returns a ndarray of Double from the given ndarray to each element of which an exp function has been applied.
     */
    public fun <T : Number, D : Dimension> exp(a: MultiArray<T, D>): Ndarray<Double, D>

    /**
     * Returns a ndarray of Double from the given ndarray to each element of which a log function has been applied.
     */
    public fun <T : Number, D : Dimension> log(a: MultiArray<T, D>): Ndarray<Double, D>

    /**
     * Returns a ndarray of Double from the given ndarray to each element of which a sin function has been applied.
     */
    public fun <T : Number, D : Dimension> sin(a: MultiArray<T, D>): Ndarray<Double, D>

    /**
     * Returns a ndarray of Double from the given ndarray to each element of which a cos function has been applied.
     */
    public fun <T : Number, D : Dimension> cos(a: MultiArray<T, D>): Ndarray<Double, D>

    /**
     * Returns maximum element of the given ndarray.
     */
    public fun <T : Number, D : Dimension> max(a: MultiArray<T, D>): T

    /**
     *
     */
    public fun <T : Number, D : Dimension, O: Dimension> max(a: MultiArray<T, D>, axis: Int): Ndarray<T, O>

    /**
     *
     */
    public fun <T : Number> maxD2(a: MultiArray<T, D2>, axis: Int): Ndarray<T, D1>

    /**
     *
     */
    public fun <T : Number> maxD3(a: MultiArray<T, D3>, axis: Int): Ndarray<T, D2>

    /**
     *
     */
    public fun <T : Number> maxD4(a: MultiArray<T, D4>, axis: Int): Ndarray<T, D3>

    /**
     *
     */
    public fun <T : Number> maxDN(a: MultiArray<T, DN>, axis: Int): Ndarray<T, D4>

    /**
     * Returns minimum element of the given ndarray.
     */
    public fun <T : Number, D : Dimension> min(a: MultiArray<T, D>): T

    /**
     *
     */
    public fun <T : Number, D : Dimension, O: Dimension> min(a: MultiArray<T, D>, axis: Int): Ndarray<T, O>

    /**
     *
     */
    public fun <T : Number> minD2(a: MultiArray<T, D2>, axis: Int): Ndarray<T, D1>

    /**
     *
     */
    public fun <T : Number> minD3(a: MultiArray<T, D3>, axis: Int): Ndarray<T, D2>

    /**
     *
     */
    public fun <T : Number> minD4(a: MultiArray<T, D4>, axis: Int): Ndarray<T, D3>

    /**
     *
     */
    public fun <T : Number> minDN(a: MultiArray<T, DN>, axis: Int): Ndarray<T, D4>

    /**
     * Returns sum of all elements in the given ndarray.
     */
    public fun <T : Number, D : Dimension> sum(a: MultiArray<T, D>): T

    /**
     *
     */
    public fun <T: Number, D: Dimension, O: Dimension> sum(a: MultiArray<T, D>, axis: Int): Ndarray<T, O>

    /**
     *
     */
    public fun <T: Number> sumD2(a: MultiArray<T, D2>, axis: Int): Ndarray<T, D1>

    /**
     *
     */
    public fun <T: Number> sumD3(a: MultiArray<T, D3>, axis: Int): Ndarray<T, D2>

    /**
     *
     */
    public fun <T: Number> sumD4(a: MultiArray<T, D4>, axis: Int): Ndarray<T, D3>

    /**
     *
     */
    public fun <T: Number> sumDN(a: MultiArray<T, DN>, axis: Int): Ndarray<T, D4>

    /**
     * Returns cumulative sum of all elements in the given ndarray.
     */
    public fun <T : Number, D : Dimension> cumSum(a: MultiArray<T, D>): D1Array<T>

    /**
     * Returns cumulative sum of all elements in the given ndarray along the given [axis].
     */
    public fun <T : Number, D : Dimension> cumSum(a: MultiArray<T, D>, axis: Int): Ndarray<T, D>
}