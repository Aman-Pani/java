import java.lang.*;
import java.util.Scanner;
class Assignment2_3{
	public static void main(String[] args){
		int array[],size,i,j,temp=0;
		array = new int[100];
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of array :: ");
		size=in.nextInt();
		System.out.print("Enter "+size+" numbers :: ");
		for(i=0;i<size;i++){
			array[i]=in.nextInt();
		}
		for(i=0;i<size;i++){
			for(j=i+1;j<size;j++){
				if(array[i]==array[j]){
					for (temp = j; temp<size; temp++) {
						array[temp] = array[temp + 1];
						size--;
                    }   
				}
			}
        }
		System.out.print("After removing duplicate :: ");
		for(i=0;i<size;i++){
			System.out.print(array[i]+" ");
		}
	}
}