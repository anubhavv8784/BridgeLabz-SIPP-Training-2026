import java.util.ArrayList;
import java.util.Scanner;

public class Level3_Q10_DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int idx = 0;
        for (String r : ranks) for (String s : suits) deck[idx++] = r + " of " + s;
        return deck;
    }

    public static void shuffle(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int rand = i + (int)(Math.random() * (n - i));
            String tmp = deck[i]; deck[i] = deck[rand]; deck[rand] = tmp;
        }
    }

    public static String[][] distribute(String[] deck, int nCards, int players) {
        if (nCards > deck.length) return null;
        if (nCards % players != 0) return null;
        int each = nCards / players;
        String[][] out = new String[players][each];
        int idx = 0;
        for (int p = 0; p < players; p++) for (int c = 0; c < each; c++) out[p][c] = deck[idx++];
        return out;
    }

    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i+1) + ":");
            for (String card : players[i]) System.out.println("  " + card);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        shuffle(deck);
        System.out.print("Enter number of cards to distribute: ");
        int nCards = Integer.parseInt(sc.next());
        System.out.print("Enter number of players: ");
        int players = Integer.parseInt(sc.next());
        String[][] hands = distribute(deck, nCards, players);
        if (hands == null) System.out.println("Cannot distribute given cards to players"); else printPlayers(hands);
        sc.close();
    }
}
