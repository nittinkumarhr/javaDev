class instanceDemo{

	int a =10;// Instance Varibles

	public static void main ( String aec[]){

		// Instanc  varibles is no direct use  in the direct in  main mmethod  beasue static rules not allow  show we can the create the object 

		// Note  -> by class object we can acess the method and instance varibles ;

		// For each and every object  threre will be sseparte copey of instance varibles ---

		instanceDemo ob1= new instanceDemo();
		System.out.println("Before update ---------------------"); // 10

		System.out.println(ob1.a); // 10

		System.out.println("After  update ---------------------"); // 10

		ob1.a =15;

		System.out.println(ob1.a); // 15

		System.out.println("after  creating ne object  ---------------------"); // 10

		instanceDemo ob2 = new   instanceDemo();

		System.out.println(ob2.a); // 10

		ob2.a = 20;
		System.out.println(ob2.a); // 20		

	}
}