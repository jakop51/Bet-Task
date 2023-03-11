public class Student extends Human {
    boolean isEmployed;
    @Override
    public void printInfo() {
        System.out.print("Is employed = " + isEmployed + " ");
        super.printInfo();
    }
}
