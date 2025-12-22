package String;

public class StringInfo {

    public static void main(String[] args) {

        //If they have the same value, they use the same memory representation
        String name = "John Marthy";
        String name1 = "John Marthy";

        //But in this way, they each uses its own memory representation (because they are Objects)
        String country = new String("My second option.");
        String country1 = new String("My second option.");

        //Equal compares the value, but == compares the reference!
        System.out.println(name.equals(name1));
        System.out.println(name == name1);

        System.out.println(country.equals(country1));
        System.out.println(country == country1);
        //End

    }


}
