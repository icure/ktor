/*
 * Copyright 2014-2024 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.util

internal actual fun nodeCryptoModule(): Crypto = nodeCryptoFromModule

@JsModule("crypto")
internal external val nodeCryptoFromModule: Crypto
