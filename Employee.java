import java.util.Scanner;

class Employee {
    private String employeeName;
    private double salary;
    private int yearsOfService;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public double getFinalSalary() {
        double bonus;

        if (yearsOfService >= 10)
            bonus = salary * 0.20;
        else if (yearsOfService >= 5)
            bonus = salary * 0.10;
        else
            bonus = salary * 0.05;

        return salary + bonus;
    }

    public void display() {
        System.out.println("\nEmployee Name : " + employeeName);
        System.out.println("Final Salary  : " + getFinalSalary());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Employee Name: ");
        emp.setEmployeeName(sc.nextLine());

        System.out.print("Enter Salary: ");
        emp.setSalary(sc.nextDouble());

        System.out.print("Enter Years Of Service: ");
        emp.setYearsOfService(sc.nextInt());

        emp.display();
    }
}
