import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(matchResult(0,0, 1,3));
    }

    public static int matchResult(int result1, int result2, int bet1, int bet2) {
        return (result1 > result2 && bet1 < bet2  || result1 < result2 && bet1 > bet2 || result1 == result2 && bet1 != bet2 || result1 != result2 && bet1 == bet2)
                ? 0 : ((result1 == bet1 && result2 == bet2) ? 2 : 1);
    }
}



