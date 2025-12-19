public class Students {
    public Students() {
        System.out.println("Hi, I am inside constructor.");
    }

    int rollNumber;
    String name;

    public Students(int i, String n) {
        rollNumber = i;
        name = n;
    }

    public void display() {
        System.out.println("Roll number is " + rollNumber + " and name is " + name);
    }
    public static void main(String[] args) {
        Students std = new Students();
        Students std1 = new Students(10, "James");
        Students std2 = new Students(20, "Natalia");

        std1.display();
        std2.display();

    }

}
