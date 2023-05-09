public class app {

    public static void main(String[] args) {

        Animals animal = new Animals();
        animal.setAnimals("lion", "java", "meat");
        animal.introduceAnimals();

        Visitors visitors = new Visitors();
        visitors.getName("Aling Nena");
        visitors.introduce();
        visitors.getAge();

        Employees employees = new Employees();
        employees.getName("Siglo");
        employees.setAnimal("lion");
        employees.introduce();

        Managers managers = new Managers();
        managers.setName("Mark");
        managers.setAge(22);
        managers.setTitle("boss");
        managers.introduce();
        managers.getSalaryEmployee();


    }

}