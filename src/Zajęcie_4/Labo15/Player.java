package Zajęcie_4.Labo15;

import java.util.SplittableRandom;
import java.util.stream.Stream;

public interface Player {
    String Play();
    String Pause();
    String Stop();
    String NextSong();
    String PreviousSong();
}
