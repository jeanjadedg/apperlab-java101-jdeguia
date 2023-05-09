public class Visitors {

    String name;
    private int age = 41;

    void getName(String name) {
        this.name = name;
    }

    void getAge() {
        this.age = age;
        System.out.println("I am " + age + " years old");
    }

    void introduce() {
        System.out.println("Hi, my name is " + name);
    }




}
