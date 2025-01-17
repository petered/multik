/*
 * Copyright 2020-2021 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package org.jetbrains.kotlinx.multik.api.linalg

import org.jetbrains.kotlinx.multik.ndarray.complex.Complex
import org.jetbrains.kotlinx.multik.ndarray.data.D2
import org.jetbrains.kotlinx.multik.ndarray.data.D2Array
import org.jetbrains.kotlinx.multik.ndarray.data.MultiArray
import kotlin.jvm.JvmName

/**
 * Returns PLU decomposition of the float matrix
 */
@JvmName("pluF")
public fun LinAlg.plu(mat: MultiArray<Float, D2>): Triple<D2Array<Float>, D2Array<Float>, D2Array<Float>> = this.linAlgEx.pluF(mat)

/**
 * Returns PLU decomposition of the numeric matrix
 */
@JvmName("pluD")
public fun <T : Number> LinAlg.plu(mat: MultiArray<T, D2>): Triple<D2Array<Double>, D2Array<Double>, D2Array<Double>> = this.linAlgEx.plu(mat)

/**
 * Returns PLU decomposition of the complex matrix
 */
@JvmName("pluC")
public fun <T : Complex> LinAlg.plu(mat: MultiArray<T, D2>): Triple<D2Array<T>, D2Array<T>, D2Array<T>> = this.linAlgEx.pluC(mat)