import java.util.Scanner;

class MultiplicationTable {
    synchronized void printTable(int num){
        System.out.println("\nTABLE: "+num);
        for(int i = 1; i <= 10; ++i){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
class MyThread extends Thread{
	MultiplicationTable m;
    int t;
	public MyThread(MultiplicationTable m,int t){
		this.m=m;
        this.t=t;
	}
	public void run(){
		m.printTable(t);
	}
}
public class Assignment11_4{
    public static void main(String args[]){
        int t1,t2,t3;
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter the value of t1:");     
        t1=in.nextInt(); 
        System.out.print("Enter the value of t2:");
        t2=in.nextInt(); 
        System.out.print("Enter the value of t3:");
        t3=in.nextInt(); 

        MultiplicationTable table = new MultiplicationTable();
        MyThread t = new MyThread(table,t1);
        t.start();
        t = new MyThread(table,t2);
        t.start();
        t = new MyThread(table,t3);
        t.start();
    }
}