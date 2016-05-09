package gof.structural.adapter.impl;

import gof.structural.adapter.AdvancedMediaPlayer;

/**
 * Created by rtsy on 21.03.2016.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file. Name: " + fileName);
    }
}
