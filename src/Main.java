import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class Main {

    public static double getPercentOfEmployedStudent(Student[] studentsInfo) {
        double percent;
        double employers = 0;
        double correctAge = 0;
        for (int i = 0; i < studentsInfo.length; i++) {
            if (studentsInfo[i].age >= 30 && studentsInfo[i].age <= 40) {
                correctAge++;
            }
            if (studentsInfo[i].isEmployed) {
                employers++;
            }
        }

        //percent = (100 / (correctAge / employers)) * 0.01;
        percent = correctAge / employers;
        return percent;
        // Write code above this line
    }

    public static void main(String[] args) {
        System.out.println("Hello ");
    }



}



