package com.coherentsolutions.advanced.java.structural.adapter.ex02;

import com.coherentsolutions.advanced.java.structural.adapter.MediaPlayer;
import com.coherentsolutions.advanced.java.structural.adapter.Mp4Player;
import com.coherentsolutions.advanced.java.structural.adapter.VlcPlayer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class MediaAdapter implements MediaPlayer {
    private final Map<String, Consumer<String>> mediaMap;

    public MediaAdapter() {
        mediaMap = new HashMap<>();
        mediaMap.put("vlc", new VlcPlayer()::playVlc);
        mediaMap.put("mp4", new Mp4Player()::playMp4);
    }

    public void play(String fileName, String audioType) {
        Consumer<String> player = mediaMap.get(audioType.toLowerCase());
        if (player != null) {
            player.accept(fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
