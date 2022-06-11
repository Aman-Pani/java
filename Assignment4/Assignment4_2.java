import java.util.Scanner;
import java.lang.*;
class Account{
    float  balance;
    String accNo;
    int    timePeriod;
    static float intInYears = 7.5f;
    Account(String x, float y, int z){
        accNo      = x;
        balance    = y;
        timePeriod = z;
    }
    float calculateInterest(){
        return balance * timePeriod * intInYears / 100;
    }
    void showAccDetails(){
        System.out.println("Account Number -> " + accNo 
                        +"\nBalance        -> " + balance 
                        +"\nInterest       -> " + calculateInterest());
    }
    static void changeIntRate(float newRate){
        intInYears = newRate;
    }
}   
public class Assignment4_2{
    public static void main(String[] args){
        System.out.print("Enter the number of accounts :::> ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Account[] arr = new Account[n];
        for (int i=0;i<n;i++){
            System.out.println("\nEnter the Details of Account "+(i+1)+" : ");
            System.out.print("Account Number :> ");
            String acNo = in.nextLine();
            System.out.print("Balance        :> ");
            float bal = in.nextFloat();
            System.out.print("Time Period    :> ");
            int tp = in.nextInt();
            in.nextLine();
            arr[i] = new Account(acNo, bal, tp);
        }
        System.out.println("***************All Account Details***************");
        for (int i=0;i<n;i++) {
            System.out.println();
            arr[i].showAccDetails();
        }
        System.out.print("\nEnter new Rate of interest ::> ");
        float r = in.nextFloat();
        System.out.println("\n********All Account Details After New Interest********");
        for (int i = 0; i < n; i++) {
            System.out.println();
            Account.changeIntRate(r);
            arr[i].showAccDetails();
        }
    }
}