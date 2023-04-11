package com.example.audiorecodertest.domain

import java.io.File

/**
 * Created by jaehyeon.
 * Date: 2023/04/11
 */
interface AudioPlayer {
    fun playFile(file: File)
    fun stop()
}