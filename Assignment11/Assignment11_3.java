import java.util.Scanner;

class Mythread extends Thread{
	int no1,no2,no3;
	Mythread(int no1,int no2,int no3){
		this.no1 = no1;
		this.no2 = no2;
		this.no3 = no3;
		
	}
	public void run(){
		System.out.println();
		for(int i=1;i<=10;i++){
			System.out.println(no1+" * "+i+" = "+no1*i);	
		}
		System.out.println();
		for(int i=1;i<=10;i++){
			System.out.println(no2+" * "+i+" = "+no2*i);	
		}
		System.out.println();
		for(int i=1;i<=10;i++){
			System.out.println(no3+" * "+i+" = "+no3*i);
		}
	}
}

class Assignment11_3{
	public static void main(String [] args){
		int n1,n2,n3;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of n1:");
		n1 = in.nextInt();
		System.out.print("Enter the value of n2:");
		n2 = in.nextInt();
		System.out.print("Enter the value of n3:");
		n3 = in.nextInt();
		
		Mythread t1 = new Mythread(n1,n2,n3);

		t1.start();
		try{
			t1.join();
		}catch(InterruptedException e){}

		t1.start();
		try{
			t1.join();
		}catch(InterruptedException e){}

		t1.start();
		try{
			t1.join();
		}catch(InterruptedException e){}
	}
}