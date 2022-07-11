

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        System.out.println(new Checker().timeOfDay("00:00:00"));
        System.out.println(new Checker().timeOfDay("09:09:09"));
        System.out.println(new Checker().timeOfDay("10:59:59"));
        System.out.println(new Checker().timeOfDay("23:23:23"));
    }
}
