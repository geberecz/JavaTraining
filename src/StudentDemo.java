public class StudentDemo {

    int rollnumber;
    String name;
    String Standard;

    public StudentDemo(int rollnumber, String name, String Standard) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.Standard = Standard;
    }

    public void display() {
        System.out.println("Roll number: " + rollnumber + ", name: " + name + ", standard: " + Standard);
    }
    public static void main(String[] args) {
        StudentDemo std1 = new StudentDemo(10, "Frank", "2nd");
        StudentDemo std2 = new StudentDemo(20, "Michael", "5th");

        std1.display();
        std2.display();
    }


}
