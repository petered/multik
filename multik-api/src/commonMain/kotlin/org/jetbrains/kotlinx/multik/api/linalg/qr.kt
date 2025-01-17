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
 * Returns QR decomposition of the float matrix
 */
@JvmName("qrF")
public fun LinAlg.qr(mat: MultiArray<Float, D2>): Pair<D2Array<Float>, D2Array<Float>> = this.linAlgEx.qrF(mat)

/**
 * Returns QR decomposition of the numeric matrix
 */
@JvmName("qrD")
public fun <T : Number> LinAlg.qr(mat: MultiArray<T, D2>): Pair<D2Array<Double>, D2Array<Double>> = this.linAlgEx.qr(mat)

/**
 * Returns QR decomposition of the complex matrix
 */
@JvmName("qrC")
public fun <T : Complex> LinAlg.qr(mat: MultiArray<T, D2>): Pair<D2Array<T>, D2Array<T>> = this.linAlgEx.qrC(mat)