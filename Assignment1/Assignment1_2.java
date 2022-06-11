/*Write a java program to demonstrate all arithmetic operators, 
bitwise operators in a single program.*/ 
public class Assignment1_2{
	public static void main(String[] args){
		int a = 11,b = 2;
		System.out.println("num1=80  &  num2=20");
		System.out.println("num1+num2= " + (a+b));
		System.out.println("num1-num2= " + (a-b));
		System.out.println("num1*num2= " + (a*b));
		System.out.println("num1/num2= " + (a/b));
		System.out.println("num1%num2= " + (a%b));
		
		System.out.println("num1 & num2= " + (a&b));
		System.out.println("num1 | num2= " + (a|b));
		System.out.println("num1 ^ num2= " + (a^b));
		System.out.println("num1 >>num2= " + (a>>b));
		System.out.println("num1 <<num2= " + (a<<b));
		System.out.println("~num1= " + (~a));
	}
}