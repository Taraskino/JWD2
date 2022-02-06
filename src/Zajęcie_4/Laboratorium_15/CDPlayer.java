package Zajęcie_4.Laboratorium_15;

public class CDPlayer extends MusicPlayer{
    public CDPlayer(Song[] libraryOfSongs) {
        super(libraryOfSongs);
    }

    @Override
    public void play() {
        System.out.println("CD odtwarza" + getCurrentSong());
    }
    @Override
    public void pause() {
        System.out.println("CD pauza");
    }
    @Override
    public void stop() {
        System.out.println("CD player");
    }
}
