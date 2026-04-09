
class Employee {
    String name = "Krupa";
    String department = "CE";

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize = 5;
    String project = "AI Project";

    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + project);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee();
        System.out.println("Employee Details:");
        e.displayDetails();

        Employee m = new Manager(); 
        System.out.println("\nManager Details:");
        m.displayDetails(); 
    }
}
