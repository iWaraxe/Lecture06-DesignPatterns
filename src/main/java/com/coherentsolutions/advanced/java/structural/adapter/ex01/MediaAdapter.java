package com.coherentsolutions.advanced.java.structural.adapter.ex01;

import com.coherentsolutions.advanced.java.structural.adapter.MediaPlayer;
import com.coherentsolutions.advanced.java.structural.adapter.Mp4Player;
import com.coherentsolutions.advanced.java.structural.adapter.VlcPlayer;

public class MediaAdapter implements MediaPlayer {
    private VlcPlayer vlcPlayer;
    private Mp4Player mp4Player;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player.playMp4(fileName);
        }
    }
}
