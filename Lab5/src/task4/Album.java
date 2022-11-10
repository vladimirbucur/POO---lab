package task4;

import java.util.ArrayList;

public abstract class Album {
    ArrayList<Song> album = new ArrayList<>();

    abstract void addSong(Song song);

    void removeSong(Song song) {
        album.remove(song);
    }

    public String toString() {
        String output = "Album{songs=[";
        for(Song song : album) {
            output += song.toString();
            output += ", ";
        }
        output = output.substring(0, output.length() - 2);
        output += "]";
        return output;
    }
}
