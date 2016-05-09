package gof.structural.adapter.impl;

import gof.structural.adapter.AdvancedMediaPlayer;

/**
 * Created by rtsy on 21.03.2016.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
