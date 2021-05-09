package DieSample;

public class DieGame {
    public static final int GOAL_SCORE = 100;
    private DiePlayer[] players;
    private int[] playerScores;

    public DieGame(DiePlayer[] players) {
        this.players = players;
        playerScores = new int[this.players.length];
    }

    public int playTurn(DiePlayer p, int playerNum) {
        int myScore = playerNum;
        int maxScore = this.getMaxScore();
        for(int rolls = 0; p.isRolling(myScore, p.addRollValue(0), maxScore, rolls) && (myScore + p.addRollValue(0) < GOAL_SCORE); rolls++);
        System.out.println("skor: " + (myScore + p.addRollValue(0)));
        return p.addRollValue(0);
    }

    public int play() {
        int i = 0, j = 0;
        for(i = 0; i < GOAL_SCORE; i = getMaxScore()) {
            for(j = 0; j < players.length && getMaxScore() < GOAL_SCORE; j++) {
                System.out.println("oyuncu " + j);
                playerScores[j] = playerScores[j] + playTurn(players[j], playerScores[j]);
            }
        }
        return j;
    }
    public int getMaxScore() {
        int max = 0;
        for(int i = 0; i < playerScores.length; i++) {
            if(!(playerScores[max] >= playerScores[i])) {
                max = i;
            }
        }
        return playerScores[max];
    }

    public void printScores() {
        for(int i = 0; i < playerScores.length; i++) {
            System.out.println(playerScores[i]);
        }
    }
}
