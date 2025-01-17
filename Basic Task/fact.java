import java.util.Scanner;

class factoril{

	public static void fact(int num ){
		int cal=1;
		for (int i =1;i<=num;i++ ) {
			cal *= i;
		}
		System.out.println("factoril cal :" + cal);
	}

	public static void main(String args[]){
		System.out.println("Enter the number to calculate the factoril :");
		Scanner sc = new Scanner(System.in);

		int num =sc.nextInt();

		fact(num);
	}
}