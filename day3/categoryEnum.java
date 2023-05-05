public class categoryEnum {

    public static void main(String[] args) {

        categoryEnumerator();
    }

    public static void categoryEnumerator() {

        double men = 13.57;
        double women = 20.45;
        double kid= 45.6;
        double grandma = 56.67;
        double grandpa= 3.56;
        
        Category chosenCategory = Category.MEN;
        
        switch (chosenCategory) {
            case MEN: System.out.println(men); break;
            case WOMEN: System.out.println(women); break;
            case KID: System.out.println(kid); break;
            case GRANDMA: System.out.println(grandma); break;
            case GRANDPA: System.out.println(grandpa); break;
        }
    }

    public enum Category {
        MEN, WOMEN, KID, GRANDMA, GRANDPA
    }
}
