package DieSample;

import java.util.Random;

public class Die {
    public int nextRoll() {
        Random rnd = new Random();
        return rnd.nextInt(6) + 1;
    }
}