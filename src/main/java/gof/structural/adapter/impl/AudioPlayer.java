package gof.structural.adapter.impl;

import gof.structural.adapter.AudioType;
import gof.structural.adapter.MediaPlayer;

/**
 * Created by rtsy on 21.03.2016.
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter _mediaAdapter;

    @Override
    public void play(AudioType audioType, String fileName) {
        if (audioType == AudioType.MP3) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        else if (audioType == AudioType.VLC || audioType == AudioType.MP4) {
            _mediaAdapter = new MediaAdapter(audioType);
            _mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("Invalid format input file type.");
        }
    }
}
