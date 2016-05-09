package gof.structural.adapter.impl;

import gof.structural.adapter.AdvancedMediaPlayer;
import gof.structural.adapter.AudioType;
import gof.structural.adapter.MediaPlayer;

/**
 * Created by rtsy on 21.03.2016.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer _advancedMediaPlayer;

    public MediaAdapter(AudioType audioType) {
        switch (audioType) {
            case VLC:
                _advancedMediaPlayer = new VlcPlayer();
                break;
            case MP4:
                _advancedMediaPlayer = new Mp4Player();
                break;
        }
    }

    @Override
    public void play(AudioType audioType, String fileName) {
        switch (audioType) {
            case VLC:
                _advancedMediaPlayer.playVlc(fileName);
                break;
            case MP4:
                _advancedMediaPlayer.playMp4(fileName);
                break;
        }
    }
}