import java.util.Scanner;
class Assignment2_1{
	public static void main(String args[]){
		int array[],i,num,flag=0;
		array=new int[10];
		Scanner in=new Scanner(System.in);
		System.out.print("Enter 10 Numbers :: ");
		for(i=0;i<10;i++){
			array[i]=in.nextInt();
		}
		System.out.print("Enter a Number to search :: ");
		num=in.nextInt();
		for(i=0;i<10;i++){
			if(num==array[i]){
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.print("The number is at position "+i);
		}
		else{
			System.out.println("The number is not found...!!!");
		}
	}
}	