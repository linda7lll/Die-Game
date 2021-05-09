package DieSample;

public class RaceToGoalDiePlayer implements DiePlayer {
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
        turnTotal = turnTotal + die;
        turnScore = turnTotal;
        System.out.println(die + " atildi");
        if(!(myScore < 71 && maxScore < 71))
        {
            return true;
        }
        else if(turnTotal < 21 + Math.round((maxScore - myScore)/8))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}