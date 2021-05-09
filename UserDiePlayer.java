import java.util.Scanner;

public class UserDiePlayer  {

    @Override
    public boolean isRolling(int myScore, int turnTotal, int maxScore, int rolls) {
        Scanner sc;
        String str = sc.nextLine();
        while(sc.hasNextLine()) {
            System.out.println("Roll or Hold?");
            if(str.length() == 0) {
                return true;//roll
            }
            else
                return false; //hold

        }
    }
}
