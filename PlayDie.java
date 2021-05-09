package DieSample;

public class PlayDie {
    
    public static void main(String[] args) {
        
        // UserDiePlayer u1 = new UserDiePlayer();
        HoldAt20DiePlayer c1 = new HoldAt20DiePlayer();
        HoldAt25DiePlayer c2 = new HoldAt25DiePlayer();
        RaceToGoalDiePlayer c3 = new RaceToGoalDiePlayer();
        
        DiePlayer [] plyrs = new DiePlayer[3];

        plyrs[0] = c1;
        plyrs[1] = c2;
        plyrs[2] = c3;
        // plyrs[4] = u1;
        DieGame game1 = new DieGame(plyrs);
        int winner = game1.play();
        game1.printScores();
        System.out.println("\nwinner is player " + winner + ".");
  
    }
}
