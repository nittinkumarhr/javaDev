import  java.util.Scanner;
class SumArrayClass{
	// sum of array
	public static int  calSum(int arr[],int s){
		int sum =0;
		for (int i =0;i<s ;i++ ) {

			sum +=arr[i];

		}
		return sum;
	}

	// sum of even index

	public static int SumEven(int arr[],int s){
		int sum =0;
		for (int i=0;i<s ;i++ ) {
			if (i%2==0) {
				sum+=arr[i];
				
			}
			
		}
		return sum;
	}
	// sum of alternative index
	public static int  alternativeindex(int arr[],int s){
		int sum=0;
		for (int i=0;i<s ;i++ ) {
			if (i%3==0) {
				sum+=arr[i];
				
			}
		}
		return sum;
	}

	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the Array size :");
		 int s =sc.nextInt();
		 System.out.println("Enter the Element DO you want to Enter in the Array :)");

		 int arr[] = new int[s];
		 for (int i =0; i<s;i++) {

		 	arr[i]=sc.nextInt();
		 	
		 }

		 System.out.println("Sum of Array :\t"+calSum(arr,s));
		  System.out.println("Sum of Even Index of  Array :\t"+ SumEven(arr,s));
		 System.out.println(" sum of alternative index : \t"+alternativeindex(arr,s));

	}
}