import java.util.Scanner;
import java.lang.*;

class Employee{
	private String empName;
	private int empID;
	Employee(){                 //  default constructor
		
	}
	Employee(String n, int id){ //  parameterised constructor
		empName=n;
		empID=id;
	}
    void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Employee name   :: ");
        empName=sc.nextLine();
        System.out.print("Enter the Employee Number :: ");
        empID=sc.nextInt();
    }
	void dynamicBinding(){
		System.out.println("Employee class is called");
	}
    void displayData(){
		System.out.println("Employee name = "+empName+
                         "\nEmployee ID   = "+empID);
	}
}
class Manager extends Employee{
	private double basicSalary;
	private byte DA;
	private byte HRA;
    double gross;
	Manager(){                               //  default constructor
		super();
		basicSalary=0;
	}
	Manager(String n,int id,double sal){     //  parameterised constructor
		super(n,id);
		basicSalary=sal;
	}
	void dynamicBinding(){
		System.out.println("Manager class is called");
	}
	void getInfo(){
		super.displayData();
	}
	void calSal(){
		DA  = (byte)(0.2*basicSalary);
		HRA = (byte)(0.3*basicSalary);
        gross=basicSalary+DA+HRA;
	}
	void printInfo(){
		super.displayData();
		System.out.println("Salary = "+basicSalary+
                         "\nDA     = "+DA+
                         "\nHRA    = "+HRA+
                         "\nGross  = "+gross);
	}
	void input(){
		super.inputData();
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Basic Salary    :: ");
		basicSalary=sc.nextDouble();
	}
}
class Assignment5_4{
	public static void main(String args []){

        System.out.println("\nManager Details  : **********");
		Manager m1 = new Manager("Aman" , 11 , 300);
		m1.calSal();
		m1.printInfo();

        Manager m2 = new Manager();
        m2.input();
        m2.calSal();
        m2.printInfo();
		
		//Dynamic Binding
		System.out.println("***example of dynamic binding***");
		Manager m3 = new Manager();
		m3.dynamicBinding();
	}
}