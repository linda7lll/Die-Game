package DieSample;

public class HoldAt20DiePlayer implements DiePlayer {
    private int turnScore = 0;

    @Override
    public int addRollValue(int rollValue) {
        turnScore = turnScore + rollValue;
        return turnScore;
    }

    
    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        Die d = new Die();
        int die = d.nextRoll();
        if(die == 1) {
            System.out.println("1 atıldı, puan kazanılmadı");
            turnTotal = 0;
            turnScore = turnTotal;
            return false;
        }
        System.out.println(die + " atildi");
        turnTotal = turnTotal + die;
        turnScore = turnTotal;
        if(turnTotal < 20) {
            return true;
        }
        return false;
    }
}
