package DieSample;

public interface DiePlayer {
    public int addRollValue(int rollValue);
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls);
}
