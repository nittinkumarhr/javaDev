import java.util.Scanner;
public class trapWaterArray{

	public static void trapWaterArrayf(int arr[], int s){

		int arr2[] = new int [s];

		for (int i=0;i<s;i++ ) {

			arr2[i] =arr[i];
			
		}

		System.out.println(" Print the Array2 ");
		for (int i=0;i<s;i++ ) {

			System.out.print(arr2[i]+ " ");
			
		}

	}

	public static void main (String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size  ");

		int size =sc.nextInt();

		System.out.println("Enter the Element in the array ");

		int arr[] = new int [size];

		for (int i=0;i<size;i++) {

			arr[i] = sc.nextInt();
		}

		trapWaterArrayf(arr ,size);


	}
}