import java.io.IOException;  
import java.io.RandomAccessFile; 
class Assignment12_3{
	public static void main(String[] args){
		String line;
		try{
		    RandomAccessFile rf = new RandomAccessFile("s.txt","r"); //  read mode
			System.out.println("File content before writing : ");
			while((line = rf.readLine()) != null){
				System.out.println(line);
			}
			rf.close();
			
			RandomAccessFile wf = new RandomAccessFile("s.txt","rw");  //  read write mode
			System.out.println("\nFile content after writing : ");
			wf.seek(20);
			String s="Chai pilo";
			wf.write(s.getBytes());
			wf.seek(0);
			
			while((line = wf.readLine()) != null){
				System.out.println(line);
			}
			wf.close();
			
		}
		catch (IOException ex){ 
			System.out.println("Something went Wrong"); 
			ex.printStackTrace(); 
		} 
	}
}