package Zajęcie_4.Laboratorium_15;

public class TestPlayer {
    public static void main(String[] args) {
        Song[] library = new Song[3];
        library[0] = new Song("Michael Jakson", "Beat IT", "Thriller");
        library[1] = new Song("Pearl Jam", "Even Flow", "Ten");
        library[2] = new Song("Portishead", "Over", "NYC Live");

        Player[] players = new Player[]{new MP3Player(library), new CDPlayer(library)};
        players[0].play();
        players[0].stop();
        players[0].play();
        players[0].nextSong();


        System.out.println();

        players[1].play();
        players[1].play();
        players[1].nextSong();
        players[1].stop();
        players[1].previousSong();
        players[1].pause();
    }
}

