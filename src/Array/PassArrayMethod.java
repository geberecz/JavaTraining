package Array;

public class PassArrayMethod {

    public static void findMin(int[] arrayOne) {
        int min = arrayOne[0];
        for (int i=1; i<arrayOne.length; i++) {
            if (min > arrayOne[i]) {
                min = arrayOne[i];
            }
        }
        System.out.println("Tne minimum value is: " + min);
    }

    public static int[] getArray() {

        return new int[] {1,12,5,10,8};
    }
    public static void main(String[] args) {
        PassArrayMethod pass = new PassArrayMethod();

        int[] arrayTest = {10,20,4,67,12,5};

        pass.findMin(arrayTest);

        int[] arrayThree = pass.getArray();
        System.out.println(arrayThree[2]);

    }
}
