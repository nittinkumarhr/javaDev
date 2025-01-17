import  java.util.Scanner;
class fibonaccic{

	public static void  fibonacci_fun(int num){

		int num1 = 0;
		int num2  = 1;
		System.out.println( " Number of  Series the fibonacci  :");
		for (int i =0 ;i<=num ;i++) {

			System.out.print( num1 +" ");

			int num3 =  num1 + num2 ;

			num1 = num2 ;

			num2 =num3 ;
		}
	}

	public static void main(String args[]){
		System.out.println("Enter the Number to Calculate fibonacci :\n");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		fibonacci_fun(num);


	}
}