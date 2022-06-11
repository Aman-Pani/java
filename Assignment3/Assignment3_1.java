import java.lang.*;
import java.util.Scanner;
class Assignment3_1{
	public static void main(String [] args){
        Number obj = new Number();
        obj.setNum();
		obj.displayNum();
	    obj.factorial();
        obj.isPrime();
		obj.sumOfDigit();
		obj.reverseNum();	
    }
}
class Number{
    int num;
    void setNum(){
		Scanner in =new Scanner(System.in);
		System.out.print("Enter the number: ");
		num =in.nextInt();
	}
	public void displayNum(){
        System.out.println("The number is: "+ num);
    }
	public void factorial(){  
        int i,fact=1;      
        for(i=1;i<=num;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+ num +" is: "+fact);    
    }  
    public void isPrime(){
		int n=num;
        boolean Prime = true;
        if (n == 0 || n == 1)
            Prime = false;
        else {   
            for (int i = 2; i <= n / 2; i++){
                if (n % i == 0) {
                    Prime = false;
                    break;
                }
            }
        }        
        if (Prime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num +" is not a Prime Number");
    }
	public void sumOfDigit(){   
        int sum = 0;
        int n=num ; 
        while (n != 0){
            sum = sum + n % 10;
            n = n/10;
        }
        System.out.println("The sum of digits of "+ num +" is: " +sum); 
    }
	public void reverseNum(){    
        int n = num, reverse = 0;  
        while(n != 0){  
            int rem = n % 10;  
            reverse = reverse * 10 + rem;  
            n = n/10;  
        }  
        System.out.println("The reverse of "+ num +" is: " +reverse);  
    }      
}
