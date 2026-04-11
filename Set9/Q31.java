import java.util.*;

public class MusicPlaylist {
    public static void main(String[] args) {

     
        LinkedList<String> playlist = new LinkedList<>();

        
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        playlist.add("Song E");

        System.out.println("Playlist after adding songs:");
        display(playlist);

    
        if (!playlist.isEmpty()) {
            String firstSong = playlist.removeFirst();
            System.out.println("\nPlaying: " + firstSong);
        }

        System.out.println("Playlist after playing first song:");
        display(playlist);

      
        if (!playlist.isEmpty()) {
            String lastSong = playlist.removeLast();
            System.out.println("\nSkipped: " + lastSong);
        }

        System.out.println("Playlist after skipping last song:");
        display(playlist);
    }

    
    public static void display(LinkedList<String> list) {
        for (String song : list) {
            System.out.println(song);
        }
    }
}
