package Zajęcie_4.Laboratorium_15;

public class MP3Player extends MusicPlayer {
    public MP3Player(Song[] libraryOfSongs) {
        super(libraryOfSongs);
    }

    @Override
    public void play() {
        System.out.println("MP3 odtwarza");
    }
    @Override
    public void pause() {
        System.out.println("MP3 pauza");
    }
    @Override
    public void stop() {
        System.out.println("MP3 player");
    }
}
