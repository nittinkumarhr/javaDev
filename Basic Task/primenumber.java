import java .util.Scanner;
class PrimeNumber{

	public static int PrimerChecker(int num){

		if (num==1) {
			return num;
		}
		for (int i=2;i<num ;i++ ) {
			if (num%i == 0) {
				return -1;
			}
		}
		return num ;
	}

	public static void main(String aers[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number Check the Prime Number :\n");
		int num = sc.nextInt();
		System.out.println("Prime Number is "+PrimerChecker(num));


	}
}