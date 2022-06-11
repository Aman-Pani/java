import java.lang.*;
class Student{
	private String name;
	private int roll;
	Student(String n,int r){
		name = n;
		roll = r;
	}
	void printStudent(){
		System.out.println("Name    = "+name+
                         "\nRoll no = "+roll);
	}
}
class Test extends Student{
	private int mark1,mark2,mark3;
	Test(String n,int r,int m1,int m2,int m3){
		super(n,r);
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
	}
	void printTest(){
		System.out.println("Mark 1  = "+mark1+
                         "\nMark 2  = "+mark2+
                         "\nMark 3  = "+mark3);
	}
}
class Result extends Test{
	private int total;
	Result(String n,int r,int m1,int m2,int m3){
		super(n,r,m1,m2,m3);
		total = m1+m2+m3;
	}
	void printResult(){
		System.out.println("Result  = "+ (double)total/3);
	}
}
class Assignment5_2{
	public static void main(String args[]){
		Result r1 = new Result("Aman",1,91,87,96);
		System.out.println("************************");
		
		r1.printStudent();
		r1.printTest();
		r1.printResult();
	}
}