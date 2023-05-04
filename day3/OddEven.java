import java.util.Scanner;

class OddEven {

    public static void main(String[] args) {

        System.out.println("Welcome! This is the odd/even number counter.");
        System.out.println();
        oddEven();

    }

    public static void oddEven() {

        // GETS THE ARRAY LENGTH AND THE ELEMENTS OF THE ARRAY
        Scanner read = new Scanner(System.in);
        System.out.print("Please enter how many numbers you want in the list: ");
        int length = read.nextInt();
        int [] myArray = new int[length];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<length; i++ ) {
            myArray[i] = read.nextInt();
        }

        int evenCounter = 0;
        int oddCounter = 0;

        // LOOPS THE ELEMENTS OF THE ARRAY TO CHECK IF ODD OR EVEN
        for (int j = 0; j < length; j++) {
            if (myArray[j] % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }

        System.out.println("There are " + evenCounter + " even numbers.");
        System.out.println("There are " + oddCounter + " odd numbers.");
    }
}