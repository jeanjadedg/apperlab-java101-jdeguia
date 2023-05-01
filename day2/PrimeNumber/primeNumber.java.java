public class primeNumber {

    private int number;

    public primeNumber(int number) {
        this.number = number;
    }

    public boolean isThisPrime() {
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
