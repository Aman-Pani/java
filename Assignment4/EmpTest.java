import java.util.Scanner;
import java.lang.*;
class Employee{
    private String empName;
    private String empNo;
    private double basicSalary;
    Employee(String name, String eno, double salary){
        empName = name;
        empNo   = eno;
        basicSalary  = salary;
    }
    void showEmployeeDetails() {
        System.out.println("Employee Name   -> " + empName
                        +"\nEmployee Number -> " + empNo
                        +"\nBasic Salary    -> " + basicSalary);
    }
}
public class EmpTest{
    public static void main(String[] args){
        System.out.print("Enter the number of employees : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        System.out.println();
        Employee[] employees = new Employee[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter info of Employee "+(i+1)+" : ");
            System.out.print("Enter Employee Name    :> ");
            String empname = in.nextLine();
            System.out.print("Enter Employee Number  :> ");
            String empno = in.nextLine();
            System.out.print("Enter Employee B.salary:> ");
            int bs = in.nextInt();
            in.nextLine();
            System.out.println();
            employees[i] = new Employee(empname, empno, bs);
        }
        System.out.println("***************All Employee Details***************");
        for (int i=0;i<n;i++){
            System.out.println();
            employees[i].showEmployeeDetails();
        }
    }
}