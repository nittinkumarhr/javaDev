import  java.util.Scanner;
public class ShoesBrand{

	public static String ShoesTags( String ur){
		String res;

		switch(ur){

			case "Nike":
				res="Just Do It";
				break;
			case "Adidas":
				res ="Impossible is Nothing";
				break;
			case "Puma":
				res = "Forever Faster";
				break;

			case "Under Armour":
				res ="I Will";
				break;
			case "Bata":
				res ="First to Bata, then to school";
				break;
			default:
   				 res = "Looking forward to the Shoes \t May be You enter the worong fromat the username  \n Please enter the Username just like this ( Nike ,Adidas )";
		}
		return res;
	}

	public static void main (String args []){

	
		System.out.println("Task : read shoes brand, based on username print slogan of brand" );


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Shoes Brand Username :\n \t To check slogan of top 5 brands in the world   \n Enter Here :)--->");
		String UserName =sc.nextLine();

		System.out.println("Shoes Name : "+ UserName +" slogan :"+ ShoesTags(UserName));






	}
}