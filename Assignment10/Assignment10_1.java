import java.util.Scanner;

class MyThread extends Thread{
    int a,b;
    MyThread(int x, int y){
        a=x;
        b=y;
    }
    public void run(){
        System.out.print("\nEven Numbers: ");
        for(int i = a+1 ; i < b; i++)
        if(i%2 == 0){
            System.out.print(i+"\t\t");
        }
    }
}
class Assignment10_1{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter lower limit : ");
        int c = in.nextInt();
        System.out.print("Enter upper limit : ");
        int d = in.nextInt();

        MyThread t1 = new MyThread(c,d);
        System.out.print("Odd  Numbers: ");
        for(int i = c+1 ; i < d; i++){
            if (i%2 != 0){
                System.out.print(i+ "\t\t");
            }
        }
        t1.start();
    }
}
//443 074 843