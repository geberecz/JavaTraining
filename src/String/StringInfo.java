package String;

public class StringInfo {
    //If they have the same value, they use the same memory representation
    String name = "John Marver";
    String name1 = "John Marver";

    //But in this way, they each uses its own memory representation (because they are Objects)
    String country = new String("My second option.");
    String country = new String("My second option.");
}
