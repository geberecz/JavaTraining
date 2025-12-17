public class SecondJavaClass {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "team";

        int a = 250;
        int b = 300;

        /*System.out.println(str1 + " " + str2);
        System.out.println(a + b);
        System.out.println(a + b + str1 + str2);
        System.out.println(str1 + str2 + a + b);
        */

        /*if(a < 100) {
            System.out.println("a is less then 100");
        } else {
            System.out.println("a is not less then 100");
        }
        */

        /*if(a == 100) {
            System.out.println("a is 100");
        } else if (a == 200){
            System.out.println("a is 200");
        } else if (a == 300) {
            System.out.println("a is 300");
        } else {
            System.out.println("a is nor 100, 200, 300");
        }
        */

        int day = 7;
        switch (day) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("Hey, its weekend :)");
                break;
        }
    }
}
