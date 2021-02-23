import java.util.Scanner;

class Employees {
    public String name;
    public int age;
    public int phone;
    public int salary;
    public String address;

    public Employees(String name, int age, int phone, int salary, String address) {
        this.name = name;

        this.age = age;
        this.phone = phone;
        this.salary = salary;
        this.address = address;

    }

    public void printSalary() {
        System.out.println("Employee Salary = " + salary);
    }
}

class Officer extends Employees {
    public String spec;
    public String dept;

    public Officer(String name, int age, int phone, int salary, String address, String spec) {

        super(name, age, phone, salary, address);
        this.spec = spec;

    }

    void show() {
        System.out.println("Name: " + name + "\nAge : " + age + "\nPhone number : " + phone + "\nAddress :  " + address
                + "\nSpecialization : " + spec);

    }
}

class Manager extends Employees {

    String dept;

    public Manager(String n, int ag, int num, int sal, String adrs, String dept) {

        super(n, ag, num, sal, adrs);

        this.dept = dept;
    }

    void show() {
        System.out.println("Name: " + name + "\nAge : " + age + "\nPhone number : " + phone + "\nAddress :  " + address
                + "\nDepartment : " + dept);

    }
}

public class Office {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name, adrs, specs, dept;
        int salary, phn;
        int age, choice;

        System.out.print("FORM");
        System.out.print("\n1.Manager\n2.Officer ");
        System.out.print("\nEnter your choice:");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("\nEnter the details");
                System.out.println("\nName : ");
                name = sc.next();
                name += sc.nextLine();
                System.out.println("Age : ");
                age = sc.nextInt();
                System.out.println("Phone number : ");
                phn = sc.nextInt();
                System.out.println("Address : ");
                adrs = sc.nextLine();
                adrs += sc.nextLine();
                System.out.println("Salary : ");
                salary = sc.nextInt();
                System.out.println("Department  : ");
                dept = sc.next();
                dept += sc.nextLine();

                Manager mg = new Manager(name, age, phn, salary, adrs, dept);
                System.out.println("\nDETAILS OF MANAGER");

                mg.show();

                break;
            case 2:
                System.out.print("\nEnter the details");
                System.out.println("\nName : ");
                name = sc.next();
                name += sc.nextLine();
                System.out.println("Age : ");
                age = sc.nextInt();
                System.out.println("Phone number : ");
                phn = sc.nextInt();
                System.out.println("Address : ");
                adrs = sc.next();
                adrs += sc.nextLine();
                System.out.println("Salary : ");
                salary = sc.nextInt();
                System.out.println("Specialization : ");
                specs = sc.next();
                specs += sc.nextLine();

                Officer of = new Officer(name, age, phn, salary, adrs, specs);
                System.out.println("\nDETAILS OF OFFICER ");

                of.show();
                break;
            default:
                System.out.println("\nInvalid choice!");
                break;
        }
        sc.close();
    }
}