import java.util.Scanner;
class Assignment2_2{
	public static void main(String[] args){
		int array[],size,i,j,temp=0;
		array = new int[100];
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of array :: ");
		size=in.nextInt();
		System.out.print("Enter "+size+" Numbers :: ");
		for(i=0;i<size;i++){
			array[i]=in.nextInt();
		}
		System.out.print("Numbers after sorting are :: ");
		for(i=0;i<size;i++){
			for (j=i+1; j<size; j++) {
                if (array[j] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
			}
			System.out.print(array[i]+" ");
		}
	}
}