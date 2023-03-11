import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        User Nikita = new User("Nikita", "Sachik", 22, "nikita@gmail.com");

        Student Angelina = new Student();
        Angelina.firstName = "Angelina";
        Angelina.lastName = "Shkolnaya";
        Angelina.isEmployed = false;
        Angelina.age = 18;

        Human Gleb = new Human();
        Gleb.firstName = "Gleb";
        Gleb.lastName = "Myrgashow";
        Gleb.age = 23;

        Human[] arr = new Human[3];
        arr[0] = Nikita;
        arr[1] = Angelina;
        arr[2] = Gleb;

        for (Human person : arr) {
            print(person);
        }
    }
    public static void print(Human human) {
        human.printInfo();
    }
}



