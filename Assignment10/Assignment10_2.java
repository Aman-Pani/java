import java.util.Scanner;
class FirstThread extends Thread{
    int a;
    FirstThread(int x){
        a=x;
    }
    public void run(){	
        System.out.print("Square  of  Number  : ");
		System.out.println(a*a);
    }
}
class SecondThread extends Thread
{
    int a;
    SecondThread(int x){
        a=x;
    }
    public void run(){	
	    int fact=1;
        System.out.print("Factorial of Number : ");
        for(int i =1; i<=a;i++){
            fact*=i;
        }
		System.out.print(fact); 
    }
}
class Assignment10_2{
    public static void main(String [] args)
	{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int x = in.nextInt();
        FirstThread obj1 = new FirstThread(x); 
		obj1.start();
		SecondThread obj2 = new SecondThread(x);
        obj2.start();
    }
}