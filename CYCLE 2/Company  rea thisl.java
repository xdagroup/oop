import java.util.Scanner;

class Employees {
    public String name;
    public int age;
    public int phone;
    public int salary;
    public String address;

    public Employees(String n, int ag, int num, int sal, String adrs) {
        this.name = n;

        this.age = ag;
        this.phone = num;
        this.salary = sal;
        this.address = adrs;

    }

    public void printSalary() {
        System.out.println("The salary of the employee is : " + salary);
    }
}

class Officer extends Employees {
    public String spec;
    public String dept;

    public Officer(String n, int ag, int num, int sal, String adrs, String spez) {

        super(n, ag, num, sal, adrs);
        this.spec = spez;

    }

    void display() {
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

    void display() {
        System.out.println("Name: " + name + "\nAge : " + age + "\nPhone number : " + phone + "\nAddress :  " + address
                + "\nDepartment : " + dept);

    }
}

public class Company {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name, adrs, specs, dept;
        int salary, phn;
        int age, choice;

        System.out.print("Please fill in the details of about one of the below two options :");
        System.out.print("\n1.Manager\n2.Officer : ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("\nEnter the folowing details for the manager :");
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
                System.out.println("\nMANAGER DETAILS ");
                System.out.println("-----------------");
                mg.display();

                break;
            case 2:
                System.out.print("\nEnter the folowing details for the officer:");
                System.out.println("Name : ");
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
                System.out.println(" Specialization in: ");
                specs = sc.next();
                specs += sc.nextLine();

                Officer of = new Officer(name, age, phn, salary, adrs, specs);
                System.out.println("\nOFFICER DETAILS ");
                System.out.println("-----------------");
                of.display();
                break;
            default:
                System.out.println("\nInvalid choice!");
                break;
        }
        sc.close();
    }
}
