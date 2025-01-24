class staicdemo{

	String name = "Divya";// Instance Varibles

	static  String name2 = "Diviye";

	public static void main (S tring aec[]){

		// we can not ascces the instance varibles in static method without creatng  objects 
		// System.out.println(name);


		//----------------static Varibles --------------------------------

		System.out.println(" before change -----------");

		staicdemo ob2= new   staicdemo();
		System.out.println(ob2.name2);// Divya

		System.out.println(" after Upadte  -----------");

		ob2.name2 = "Raj";
		System.out.println(ob2.name2);// Raj

		//------------------------------------------
		System.out.println("-------new objects  -----------");

		staicdemo ob3= new   staicdemo();
		System.out.println(ob3.name2);// Raj

		// Notr - >  when ever decaler the  vsrible  static  for ecah and every object  is not make separte copy  every object points the  one copey 
		// Static varibles  call by class  to reduce the   objects carations 

		System.out.println("--Static varibles call  by class ----------");

		System.out.println(staicdemo.name2);//Raj
	}

	public  void m1(){

		// with out static method we can  use the instancw varibles -

		System.out.println(" with out static method  : "+name);
	}

	// NOte - > all thing of static take memory space when class loder ru  like  static method (main) and varbiles 
	
} 