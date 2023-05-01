public class primeNumberRunner {

    public static void main(String[] args) {
        primeNumber number = new primeNumber(32);
        if (number.isThisPrime() == true) {
            System.out.println("This is prime number");
        } else {
            System.out.println("This is not a prime number");
        }
    }
}
