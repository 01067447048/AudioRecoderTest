package com.example.audiorecodertest.domain

import java.io.File

/**
 * Created by jaehyeon.
 * Date: 2023/04/11
 */
interface AudioRecorder {
    fun start(outputFile: File)
    fun stop()
}