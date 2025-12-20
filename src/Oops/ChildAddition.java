package Oops;

public class ChildAddition extends Addition {

    public static void main(String[] args) {
        Addition add = new Addition();

        add.addValues(11, 12);
        add.addValues(11, 12, 13);

        double d = add.addValues(11.2, 50.4);
        System.out.println(d);
    }
}
