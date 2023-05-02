public class App {
    public static void main(String[] args) {

        // notes

//        experiment1();

        }

    public static void experiment1() {
        int num1 = 10;
        long num2 = 100000000;
        double num3 = 12.34;
        float num4 = 43.21f;
        char letter1 = 'c';
        String string1 = "Hello World!";
        long sum1 = num1 + num2; // must be long not int
        double dec1 = num3 + num4; // double >> float
        System.out.println(sum1);
        System.out.println(dec1);
        System.out.println(string1.equals("hello world!"));
        System.out.println(string1.equalsIgnoreCase("hello world!"));
    }

    public static void forLoop(int number1) { // for loop to print 1 to number
        for (int i = 1; i <= number1; i++) {
            System.out.println(i);
        }
    }

    public static void whileLoop(int number) { // while loop print 1 to number
        int counter = 1;
        while(number <= counter) {
            System.out.println(counter);
            counter++;
        }
    }

}
