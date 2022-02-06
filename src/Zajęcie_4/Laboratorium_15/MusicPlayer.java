package Zajęcie_4.Laboratorium_15;

 abstract public class MusicPlayer implements Player {
  private Song[] libraryOfSongs;
  private int current;

   public MusicPlayer(Song[] libraryOfSongs) {
   this.libraryOfSongs = libraryOfSongs;
  }
  public Song getCurrentSong(){
    return libraryOfSongs[current];
  }

  @Override
  public void nextSong() {
    if (++current >= libraryOfSongs.length){
     current = 0;
    }
    play();
  }

  @Override
  public void previousSong() {
   if (--current >= 0){
    current = libraryOfSongs.length - 1;
   }
   play();
  }
 }
