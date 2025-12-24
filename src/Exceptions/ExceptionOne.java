package Exceptions;

public class ExceptionOne {

    public static void main(String[] args) {

        try {
            int i = 100;
            int j = i/0;
            System.out.println("J is: " + j);
        } catch (Exception e) {
            System.out.println("You can't divide by 0, the program will exit!");
            System.exit(123);
        } finally {
            System.out.println("End of try part...");
        }

        System.out.println("The End of program...");
    }
}
