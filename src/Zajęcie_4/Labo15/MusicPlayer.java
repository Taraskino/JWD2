package Zajęcie_4.Labo15;

public abstract class MusicPlayer implements Player {
    @Override
     public String Play() {
        return "Odtwarza się";
    }

    @Override
    public String Pause() {
        return "Pauza";
    }

    @Override
    public String Stop() {
        return "Zastopowane";
    }

    @Override
    public String NextSong() {
        return "Następna piosenka";
    }

    @Override
    public String PreviousSong() {
        return "Poprzednia piosenka";
    }
}
