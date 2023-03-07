import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(5 > 7 ? 55 : 66);
        // Can create ((a == b ? 2 : 0) == 0) ? 0 : 1)
    }

    public static int resultOfBet(int num1, int num2, int num3, int num4)
    {
        int result = (num1 == num3 && num2 == num4) ?  2 : 0;
        if (result == 2)
            return result;
        result = (num1 <= num3 && num2 <= num4 ) ?  1 : 0;



        //int i = ((num1 == num3 && num2 == num4) ? 2 : 0) > ((num1 <= num3 && num2 <= num4) ? 1 : 3) ? 1 : ((num1 == num3 && num2 == num4) ? 2 : 0);
        return result;


        //




    }


}



