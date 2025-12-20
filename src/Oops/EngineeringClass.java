package Oops;

public class EngineeringClass implements Student {

    @Override
    public void displayName() {
        System.out.println("Hi, we are from engineering");
    }

    @Override
    public void getStudentNumber() {
        System.out.println("We are 120 students");
    }

    @Override
    public void getStandard() {
        System.out.println("We are from Computer science");
    }

    public void getUniversity() {
        System.out.println("We are from " + Student.university);
    }

    @Override
    public void getInterfaceName() {

    }
}
