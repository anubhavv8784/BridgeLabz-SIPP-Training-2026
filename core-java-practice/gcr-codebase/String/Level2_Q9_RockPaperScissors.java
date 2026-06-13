import java.util.Scanner;

public class Level2_Q9_RockPaperScissors {
    public static String computerChoice() {
        double v = Math.random();
        if (v < 1.0/3) return "rock";
        if (v < 2.0/3) return "paper";
        return "scissors";
    }

    // returns 0 draw, 1 player wins, 2 computer wins
    public static int winner(String player, String comp) {
        if (player.equals(comp)) return 0;
        if (player.equals("rock") && comp.equals("scissors")) return 1;
        if (player.equals("paper") && comp.equals("rock")) return 1;
        if (player.equals("scissors") && comp.equals("paper")) return 1;
        return 2;
    }

    public static String[][] playGames(int games, Scanner sc) {
        String[][] results = new String[games+1][4]; // game, player, comp, result
        int pWins=0, cWins=0, draws=0;
        for (int i = 0; i < games; i++) {
            System.out.print("Enter choice for game " + (i+1) + " (rock/paper/scissors): ");
            String player = sc.next().toLowerCase();
            String comp = computerChoice();
            int r = winner(player, comp);
            String res = (r==0)?"Draw":(r==1?"Player":"Computer");
            if (r==1) pWins++; else if (r==2) cWins++; else draws++;
            results[i][0] = String.valueOf(i+1);
            results[i][1] = player;
            results[i][2] = comp;
            results[i][3] = res;
        }
        // summary row
        results[games][0] = "Summary";
        results[games][1] = "PlayerWins:" + pWins;
        results[games][2] = "CompWins:" + cWins;
        double total = games;
        String pct = String.format("Player%%: %.2f, Comp%%: %.2f", (pWins/total)*100, (cWins/total)*100);
        results[games][3] = pct;
        return results;
    }

    public static void display(String[][] table) {
        System.out.println("Game\tPlayer\tComputer\tResult");
        for (int i = 0; i < table.length; i++) System.out.println((table[i][0]==null?"":table[i][0]) + "\t" + (table[i][1]==null?"":table[i][1]) + "\t" + (table[i][2]==null?"":table[i][2]) + "\t" + (table[i][3]==null?"":table[i][3]));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = Integer.parseInt(sc.next());
        String[][] table = playGames(n, sc);
        display(table);
        sc.close();
    }
}
