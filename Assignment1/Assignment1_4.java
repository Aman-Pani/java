//Write a Java program to test the number is prime or composite.
import java.util.Scanner;
public class Assignment1_4 {
    public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a number= ");
        int num = input.nextInt();
		boolean flag= false;
		for(int i=2;i<= num/2; ++i)
		{
			if (num%i==0){
				flag=true;
				break;
			}
		}
		if (!flag)
			System.out.println(num+ " is a prime number.");
		else
			System.out.println(num+ " is a composite number.");
	}	
}
