public class Employees {

    String name;
    String animal;
    long salary = 100000;

    void getName (String name) {
        this.name = name;
    }

    void setAnimal(String animal) {
        this.animal = animal;
    }

    void introduce() {
        System.out.println("Hi my name is " + name + " and I am the one feeding the " + animal);
    }
    void getSalary() {
        System.out.println("This is the employees salary " + salary);
    }
}
