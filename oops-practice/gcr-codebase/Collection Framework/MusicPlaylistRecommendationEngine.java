import java.util.*;

public class MusicPlaylistRecommendationEngine {
    private LinkedList<String> recentlyPlayed;
    private static final int MAX_PLAYLIST_SIZE = 10;

    public MusicPlaylistRecommendationEngine() {
        recentlyPlayed = new LinkedList<>();
    }

    public void playSong(String songName) {
        // Add song at the beginning
        recentlyPlayed.addFirst(songName);

        // Remove oldest song if size exceeds limit
        if (recentlyPlayed.size() > MAX_PLAYLIST_SIZE) {
            String removedSong = recentlyPlayed.removeLast();
            System.out.println("Removed oldest song: " + removedSong);
        }

        System.out.println("Now playing: " + songName);
    }

    public boolean searchSong(String songName) {
        return recentlyPlayed.contains(songName);
    }

    public void displayRecentlyPlayed() {
        System.out.println("\n=== Recently Played Songs ===");
        if (recentlyPlayed.isEmpty()) {
            System.out.println("No songs played yet.");
        } else {
            for (int i = 0; i < recentlyPlayed.size(); i++) {
                System.out.println((i + 1) + ". " + recentlyPlayed.get(i));
            }
        }
        System.out.println("Total songs in history: " + recentlyPlayed.size());
    }

    public static void main(String[] args) {
        MusicPlaylistRecommendationEngine engine = new MusicPlaylistRecommendationEngine();

        System.out.println("=== Playing Songs ===");
        engine.playSong("Blinding Lights");
        engine.playSong("Shape of You");
        engine.playSong("Levitating");
        engine.playSong("Good as Hell");
        engine.playSong("Peaches");
        engine.playSong("Anti-Hero");
        engine.playSong("As It Was");
        engine.playSong("Heat Waves");
        engine.playSong("Flowers");
        engine.playSong("Cruel Summer");

        engine.displayRecentlyPlayed();

        System.out.println("\n=== Playing More Songs (Exceeding Limit) ===");
        engine.playSong("Counting Stars");
        engine.playSong("Someone You Loved");

        engine.displayRecentlyPlayed();

        System.out.println("\n=== Searching Songs ===");
        if (engine.searchSong("Blinding Lights")) {
            System.out.println("'Blinding Lights' found in recently played.");
        } else {
            System.out.println("'Blinding Lights' not found in recently played.");
        }

        if (engine.searchSong("Shape of You")) {
            System.out.println("'Shape of You' found in recently played.");
        } else {
            System.out.println("'Shape of You' not found in recently played.");
        }

        if (engine.searchSong("Old Song")) {
            System.out.println("'Old Song' found in recently played.");
        } else {
            System.out.println("'Old Song' not found in recently played.");
        }
    }
}
