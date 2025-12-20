package Oops;

public class MedicalClass implements Student {

    @Override
    public void displayName() {
        System.out.println("Hi, we are from Medical");
    }

    @Override
    public void getStudentNumber() {
        System.out.println("We are 20 students");
    }

    @Override
    public void getStandard() {
        System.out.println("We are from Ambulance");
    }

    public void getUniversity() {
        System.out.println("We are from London university");
    }

    public static void main(String[] args) {
        EngineeringClass eng = new EngineeringClass();
        MedicalClass med = new MedicalClass();

        eng.displayName();
        eng.getStandard();
        eng.getStudentNumber();
        eng.getUniversity();

        System.out.println("***********************");

        med.displayName();
        med.getStandard();
        med.getStudentNumber();
        med.getUniversity();

    }

    @Override
    public void getInterfaceName() {

    }
}
