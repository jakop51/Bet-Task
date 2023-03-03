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

        Student[] arr = new Student[3];
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.age = 30;
        s1.isEmployed = true;
        s1.firstName = "Alina";
        s1.lastName = "Ivanova";

        s2.age = 26;
        s2.isEmployed = false;
        s2.firstName = "Ivan";
        s2.lastName = "Petrov";

        s3.age = 35;
        s3.isEmployed = true;
        s3.firstName = "Irina";
        s3.lastName = "Stetsenko";

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        System.out.println("Percent is " + getPercentOfEmployedStudent(arr));
    }



}



