public class Animals {

    String name;
    String type;
    String food;

    void setAnimals(String Animals, String name, String food) {
        this.type = Animals;
        this.name = name;
        this.food = food;

    }

    void introduceAnimals() {
        if (this.type.equals("lion")) {
            System.out.println("Rawr! My name is " + name + " and thank you for the " + food + " *chewing the food*");
        } else if (this.type.equals("snake")) {
            System.out.println("ssss! My name is " + name + " and thank you for the " + food + " *chewing the food*");
        } else if (this.type.equals("monkey")) {
            System.out.println("Ook-ook! My name is " + name + " and thank you for the " + food + " *chewing the food*");
        } else if (this.type.equals("elephant")) {
            System.out.println("Pa woo! My name is " + name + " and thank you for the " + food + " *chewing the food*");
        } else {
            System.out.println("This animal is not in the zoo");
        }
    }


}

