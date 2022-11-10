package task4;

public class BadAlbum extends Album {
    public static boolean isPalindrome(int integer) {
        int palindrome = integer;
        int reverse = 0;

        // Compute the reverse
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        return integer == reverse;

    }

    public void addSong(Song song) {
        if (song.getName().length() == 3 && BadAlbum.isPalindrome(song.getId()) == true)
            album.add(song);
    }
}
