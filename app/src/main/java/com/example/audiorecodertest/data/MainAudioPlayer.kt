package com.example.audiorecodertest.data

import android.content.Context
import android.media.MediaPlayer
import androidx.core.net.toUri
import com.example.audiorecodertest.domain.AudioPlayer
import java.io.File

/**
 * Created by jaehyeon.
 * Date: 2023/04/11
 */
class MainAudioPlayer(
    private val context: Context
): AudioPlayer {

    private var player: MediaPlayer? = null

    override fun playFile(file: File) {
        MediaPlayer.create(context, file.toUri()).apply {
            player = this
            start()
        }
    }

    override fun stop() {
        player?.stop()
        player?.release()
        player = null
    }
}