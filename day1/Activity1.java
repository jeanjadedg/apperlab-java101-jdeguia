import java.util.Random;
import java.util.Scanner;

class FlamesHope {

    public static void main(String[] args) {
        System.out.println("Welcome to FlamesHope!");

        Scanner myScanner = new Scanner(System.in);

        System.out.print("What's your name: ");
        String name = myScanner.nextLine();

        if (name.isEmpty()){
            System.out.print("Your name is required, please try again :(");
            return;
        }

        System.out.print("What's your cursh name: ");
        String crushName = myScanner.nextLine();

        if (crushName.isEmpty()){
            System.out.print("Crush name is required, please try again :(");
            return;
        }

        int nameLength = name.length();
        int crushNameLength = crushName.length();
        int result = result(nameLength, crushNameLength);

        System.out.println("Your compatibility result: " + result);

        if (result < 50) {
            System.out.println("SAD :(");
        } else  {
            System.out.println( name + " and " + crushName + " <3");
        }
    }

    static int result(int nameLength, int crushNameLength) {
        int total = nameLength + crushNameLength;
        Random random = new Random();
        return random.nextInt(total - 1) + 1;
    }

}