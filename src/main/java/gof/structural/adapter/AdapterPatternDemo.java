package gof.structural.adapter;

import gof.structural.adapter.impl.AudioPlayer;

/**
 * Created by rtsy on 21.03.2016.
 * The Adapter Pattern converts the interface of a class into another interface the clients expect.
 * Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.
 *
 * Adapter pattern works as a bridge between two incompatible interfaces.
 * This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.
 * This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces.
 * java.util.Arrays#asList()
 -javax.swing.JTable(TableModel)
 -java.io.InputStreamReader(InputStream)
 -java.io.OutputStreamWriter(OutputStream)
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play(AudioType.MP3, "beyond the horizon.mp3");
        audioPlayer.play(AudioType.MP4, "alone.mp4");
        audioPlayer.play(AudioType.VLC, "far far away.vlc");
    }
}