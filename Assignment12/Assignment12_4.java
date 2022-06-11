import java.io.IOException;  
import java.io.RandomAccessFile; 
import java.io.*;
class Assignment12_4{
	public static void main(String[] args){
		String line;
		try{
		    RandomAccessFile rf = new RandomAccessFile("s1.txt","r"); //  read mode
			// System.out.println("File content of s1 : ");
			// while((lin = rf.readLine()) != null){
			// 	System.out.println(lin);
			// }

			RandomAccessFile rf1 = new RandomAccessFile("s2.txt","r"); //  read mode
			System.out.println("\nFile content of s2 : ");
			while((line = rf1.readLine()) != null){
				System.out.println(line);
			}
			rf1.close();
			
			RandomAccessFile wf = new RandomAccessFile("s2.txt","rw");  //  read write mode
			System.out.println("\nFile content of s2 after appending s1 : ");
			wf.seek(wf.length());
			String s=rf.readLine();
			wf.write(s.getBytes());
			wf.seek(0);
			
			while((line = wf.readLine()) != null){
				System.out.println(line);
			}
			wf.close();
			rf.close();
		}
		catch (IOException ex){ 
			System.out.println("Something went Wrong"); 
			ex.printStackTrace(); 
		} 
	}
}
