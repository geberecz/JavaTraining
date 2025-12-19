package Oops;

public class X3 extends BMW {

    static String model = "X3 ";
    public static void main(String[] args) {
        BMW bmw = new BMW();

        System.out.print("Model is " + model);
        System.out.print(", brand is " + BMW.name);

        System.out.print(", behavior is ");
        bmw.run();
    }

}
