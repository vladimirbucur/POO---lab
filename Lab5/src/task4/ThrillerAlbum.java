package task4;

public class ThrillerAlbum extends Album {
    public void addSong(Song song) {
        if (song.getCompose().equals("Michael Jackson") == true && song.getId() % 2 == 0)
            album.add(song);
    }
}
