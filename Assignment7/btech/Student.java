package btech;
import java.lang.*;
//import java.util.Scanner;

public class Student{
        public String studentName;
        public int rollNumber,sub1,sub2,sub3;
        public Student(String n ,int r,int m1,int m2,int m3){
            studentName=n;
            rollNumber=r;
            sub1=m1;
            sub2=m2;
            sub3=m3;
        }
        /*void inputData(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student name   :: ");
            studentName=sc.nextLine();
            System.out.print("Enter Roll Number    :: ");
            rollNumber=sc.nextInt();
            System.out.print("Enter Sub 1 mark     :: ");
            sub1=sc.nextInt();
            System.out.print("Enter Sub 2 mark     :: ");
            sub2=sc.nextInt();
            System.out.print("Enter Sub 3 mark     :: ");
            sub3=sc.nextInt();
        }*/
        public void display(){
            System.out.println("Student name = "+studentName+
                             "\nRoll number  = "+rollNumber+
                             "\nSub  1       = "+sub1+
                             "\nSub  2       = "+sub2+
                             "\nSub  3       = "+sub3+
                             "\nResult       = "+(sub1+sub2+sub3)+
                             "\nPrecentage   = "+(sub1+sub2+sub3)/3);
    }
}