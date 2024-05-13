public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1985,45,2000.0,"kemal");
        System.out.println("tax = " + emp1.tax());
        System.out.println("bonus = " +emp1.bonus());
        double salary2 = emp1.salary + emp1.bonus() - emp1.tax();
        System.out.println("salary with bonus and tax = " + salary2);
        double totalSalary = emp1.salary + emp1.bonus() -emp1.tax() + emp1.increase();
        System.out.println("salary with tax , bonus and incrase of the salary = " +totalSalary);




    }
}