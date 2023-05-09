public class Managers {

    String name;
    int age;
    String title;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void getSalaryEmployee() {
        Employees employees = new Employees();
        employees.getSalary();
    }

    void introduce() {
        System.out.println("Hi my name is " + name + ". I am " + age + " years old and I am the " +title);
    }

}
