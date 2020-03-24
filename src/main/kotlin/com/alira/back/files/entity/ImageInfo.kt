package com.alira.back.files.entity

import java.util.*

data class ImageInfo(
    val id: UUID = UUID.randomUUID(),
    val url: String = ""
)