import java.io.*;

class Assignment12_2{
	public static void main(String args[]) throws Exception{
		String[] file ={args[0],args[1]};
		FileInputStream  is = new FileInputStream(file[0]);
		FileOutputStream os = new FileOutputStream(file[1]);
		int i;
		while((i=is.read()) != -1){
			os.write(i);
		}
		
		is.close();
		os.close();
		System.out.println("File Copied!");
	}
}