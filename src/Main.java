import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(resultOfBet(13,2,14,9));
    }

    public static int resultOfBet(int num1, int num2, int num3, int num4)
    {
        int result = (num1 == num3 && num2 == num4) ?  2 : 0;
        if (result == 2)
            return result;
        result = (num1 <= num3 && num2 <= num4 ) ?  1 : 0;
        return result;
    }
}



