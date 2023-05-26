import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class shareALoadApp {
    static Map<String, User> userOfTheApp = new HashMap<>();
    static int choice;
    static Scanner scanner = new Scanner(System.in);
    static boolean sessionActive = true;
    static int state = 1;

    public static void main(String[] args) {

        userOfTheApp.put("09171234567", new User("Justine"));
        userOfTheApp.put("09171985698", new User("Mark"));
        userOfTheApp.put("09143856085", new User("Siglo"));
        userOfTheApp.put("09187345349", new User("Maricar"));
        userOfTheApp.put("09194567353", new User("Ian"));

        while (sessionActive) {
            if (state == 1) {
                choice = startTheApp();
            } else if (state == 2) {
                choice = shareALoad();
            }
            switch (choice) {
                case 1:
                    sessionActive = registerNewUser();
                    state = 2;
                    break;
                case 2:
                    sessionActive = senderRecipient();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    sessionActive = false;
                    break;
                default:
                    System.out.println("You have entered an invalid option. Goodbye.");
                    sessionActive = false;
                    break;
            }
        }
    }

    static int startTheApp() {

        System.out.println("Hi, welcome! Do you want to register or to share a load?");
        System.out.println();

        System.out.println("1 -- To register");
        System.out.println("2 -- To share a load");
        System.out.println("3 -- Exit.");
        System.out.println();

        System.out.print("Please enter your option: ");

        int choice = scanner.nextInt();

        return choice;

    }


    static boolean registerNewUser() {
        boolean unregistered = true;

        System.out.print("Please enter your number: ");
        String number = scanner.next();

        if (userOfTheApp.containsKey(number)) {
            System.out.println(number + " is already registered. Goodbye!");
            unregistered = false;
        } else {
            Scanner s = new Scanner(System.in);
            System.out.println();
            System.out.print("Please enter you name: ");
            String userName = s.nextLine();
            if (userName.length() == 0) {
                System.out.println("Name must not be empty. Goodbye!");
                unregistered = false;
            } else {
                userOfTheApp.put(number, new User(userName));
            }
            s.close();
        }
        return unregistered;
    }


    static int shareALoad() {
        System.out.println("Do you want to register a new number or to share a load?");
        System.out.println();

        System.out.println("Options:");
        System.out.println("1 -- Register another number.");
        System.out.println("2 -- Share a load.");
        System.out.println("3 -- Exit.");

        System.out.print("Choice: ");
        int choice = scanner.nextInt();
        return choice;

    }

    static boolean senderRecipient() {

        System.out.print("Please enter the sender number: ");
        String sender = scanner.next();

        if (!userOfTheApp.containsKey(sender)) {
            System.out.println("Sender " + sender + " not found.");
            return false;
        } else {
            System.out.print("Please enter the recipient number: ");
            String recipient = scanner.next();
            if (!userOfTheApp.containsKey(recipient)) {
                System.out.println("Sender " + sender + " not found.");
                return false;
            } else if (sender.equals(recipient)) {
                System.out.println("Sender and recipient shouldn't be the same.");
                return false;
            } else {
                shareLoad(sender, recipient);
            }
        }
        return true;
    }

    static void shareLoad(String senderValue, String recipientValue) {
        Scanner a = new Scanner(System.in);

        User sender = userOfTheApp.get(senderValue);
        User recipient = userOfTheApp.get(recipientValue);

        System.out.print("Please enter the amount: ");
        double amount = a.nextDouble();
        if (amount > sender.getBalance()) {
            System.out.println("Insufficient balance.");
        } else {
            sender.setBalance(sender.getBalance()-amount);
            recipient.setBalance(recipient.getBalance()+amount);
        }
        displayAllBalances();

    }

    static void displayAllBalances() {
        for (Map.Entry<String, User> user: userOfTheApp.entrySet()) {
            System.out.println(user.getKey()+ ": " + user.getValue().getName() + " " + user.getValue().getBalance());
        }
    }


}
