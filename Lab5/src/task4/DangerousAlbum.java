package task4;

public class DangerousAlbum extends Album {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void addSong(Song song) {
        if (DangerousAlbum.isPrime(song.getId()))
            album.add(song);
    }
}
