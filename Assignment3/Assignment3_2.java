import java.lang.*;
//import java.util.Scanner;
class Employee{
    String  empName;
	int       empNo;
	double basicSal,da,hra,grossSal;
	public Employee(String n, double s, int no){
        empName  = n;
        empNo    = no;
        basicSal = s;
    }
    void calGrossSal(){
        da  = basicSal * 20.0 / 100;
        hra = basicSal * 10.0 / 100;
        grossSal = basicSal + da + hra;
    } 
    void showEmpDetails(){
        System.out.println(empName+"\t"+empNo+"\t"+basicSal
                           +"\t"+da+"\t"+hra+"\t"+grossSal);
    }
}
class Assignment3_2{   
    public static void main(String args[]){
		System.out.println("NAME\t"+"EMPNO\t"+"BASIC\t"
                           +"DA\t"+"HRA\t"+"GROSS");
        Employee emp1 = new Employee("Ram",50000,1);
        emp1.calGrossSal();
        emp1.showEmpDetails(); 
		Employee emp2 = new Employee("Shyam",40000,2);
        emp2.calGrossSal();
        emp2.showEmpDetails();
    }
}