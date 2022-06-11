import java.io.*;  
class Assignment12_1{    
    public static void main(String args[])throws Exception{             
        InputStreamReader sr = new InputStreamReader(System.in);    
        BufferedReader br = new BufferedReader(sr);            
        System.out.print("Enter : ");    
        String S = br.readLine();    
        System.out.println("output : " + S);    
    }    
}