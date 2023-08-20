import java.lang.*;
public class test{
	public static void main(String[] args){
		int a = 5,b = 2;
		System.out.println("num1=5  &  num2=2");
		System.out.println("num1 + num2= " + (a+b));
		System.out.println("num1 - num2= " + (a-b));
		System.out.println("num1 * num2= " + (a*b));
		System.out.println("num1 / num2= " + (a/b));
		System.out.println("num1 % num2= " + (a%b));
		
		System.out.println("num1 & num2= " + (a&b));
		System.out.println("num1 | num2= " + (a|b));
		System.out.println("num1 ^ num2= " + (a^b));
		System.out.println("num1 >>num2= " + (a>>b));
		System.out.println("num1 <<num2= " + (a<<b));
		System.out.println("      ~num1=" + (~a));
	}
}


// num1=5  &  num2=2
// num1 + num2= 7
// num1 - num2= 3
// num1 * num2= 10
// num1 / num2= 2
// num1 % num2= 1
// num1 & num2= 0
// num1 | num2= 7
// num1 ^ num2= 7
// num1 >>num2= 1
// num1 <<num2= 20
//       ~num1=-6
