public class FirstJavaProgram {

    static int varSec = 123;
    public static void FirstMethod() {
        int number = 1245;
        String city = "New York";

        System.out.println(number);
        System.out.println(city);
        System.out.println(varSec);
    }
    public static void main(String[] args) {

        System.out.println("Hello world");
        System.out.println("My first method in the first class");

        FirstJavaProgram.FirstMethod();
    }
}
