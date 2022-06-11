/*Write a java program that will take input as two +ve integers M and N where M<N.
a). The program will display the numbers between M and N, which are divisible by 3
and 5.
b). Count the numbers which are divisible by 3 and 5(between M and N), then add those
numbers and display.*/
import java.util.Scanner;
public class Assignment1_5 {
    public static void main( String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter M= ");
        int M = input.nextInt();
        System.out.print("Enter N= ");
        int N = input.nextInt();
		if(N<M){
			System.out.println("Invalid Input");
		}
		int sum = 0;
		for( int i = M ; i <= N ; i++){
			if( i%15==0){
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("Sum of all integers b/w " + M + "and " + N + " that are divisible by both 3 and 5 : " +sum);	
	}
}
