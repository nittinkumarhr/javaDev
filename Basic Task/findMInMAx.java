import  java.util.Scanner;
public class FindMinMax{
	public static void  Min_MAX_Check( int arr[],int s){

		int minv = Integer.MAX_VALUE;

		int maxv = Integer.MIN_VALUE;

		for(int i=0;i<s;i++){

			minv = Math.min(arr[i],minv);

			maxv =  Math.max(arr[i] ,maxv);
		}
		System.out.println(" Min Element : "+minv + "\n Max Element " + maxv);


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

		Min_MAX_Check(arr ,size);


	}
}