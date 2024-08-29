package com.coherentsolutions.advanced.java.structural.adapter.ex02;

import com.coherentsolutions.advanced.java.structural.adapter.MediaPlayer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class AudioPlayer implements MediaPlayer {
    private final Map<String, BiConsumer<String, String>> mediaMap;

    public AudioPlayer() {
        mediaMap = new HashMap<>();

        // Built-in support for mp3 files
        mediaMap.put("mp3", (fileName, type) -> playMp3(fileName));

        // Support for additional formats through MediaAdapter
        MediaAdapter mediaAdapter = new MediaAdapter();
        mediaMap.put("vlc", mediaAdapter::play);
        mediaMap.put("mp4", mediaAdapter::play);
    }

    @Override
    public void play(String audioType, String fileName) {
        Optional.ofNullable(mediaMap.get(audioType.toLowerCase()))
                .ifPresentOrElse(
                        player -> player.accept(fileName, audioType),
                        () -> System.out.println("Invalid media. " + audioType + " format not supported")
                );
    }

    private void playMp3(String fileName) {
        System.out.println("Playing mp3 file. Name: " + fileName);
    }
}
