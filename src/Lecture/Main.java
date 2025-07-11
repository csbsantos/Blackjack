import Blackjack.Game;
import Blackjack.Player;

public class Main {
    public static void main(String[] args) {
       Game g1= new Game();
        Player p1;
        Player p2;


        g1.start();
        g1.determineWinner();
    }
}
