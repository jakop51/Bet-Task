import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(resultOfBet(0,0, 1,3));
    }

    public static int resultOfBet(int num1, int num2, int num3, int num4)
    {
        int result = (num1 > num2 && num3 < num4  || num1 < num2 && num3 > num4) ? 0 : ((num1 == num3 && num2 == num4) ? 2 : 1);
        return result;
    }
}



