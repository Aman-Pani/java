import java.lang.*;
import java.util.Scanner;
class Assignment2_4{
	public static void main(String[] args){
		int mat1[][],mat2[][],sum[][],i,j;
		mat1 = new int[2][3];
		mat2 = new int[2][3];
		sum = new int[2][3];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the elements of first matrix :");
		for(i=0;i<2;i++){
			for(j=0;j<3;j++){
				mat1[i][j]=in.nextInt();
			}
		}
		System.out.println("Enter the elements of Second matrix :");
		for(i=0;i<2;i++){
			for(j=0;j<3;j++){
				mat2[i][j]=in.nextInt();
			}
		}
		System.out.println("The first matrix :");
		for(i=0;i<2;i++){
			for(j=0;j<3;j++){
				System.out.print(mat1[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("The Second matrix :");
		for(i=0;i<2;i++){
			for(j=0;j<3;j++){
				System.out.print(mat1[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("\nThe result after adding the above two matrices is :");
		for(i=0; i<2; i++){
			for(j=0; j<3; j++){
				sum[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(sum[i][j]+"\t");
            }
			System.out.print("\n");
        }
        System.out.println("\nThe transpose of the sum of matrices is :");
		for(i=0; i<3; i++){
			for(j=0; j<2; j++){
				System.out.print(sum[j][i]+"\t");
            }
			System.out.print("\n");
		}
	}
}