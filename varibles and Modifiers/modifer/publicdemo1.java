// public acces the  (anywhere use   

package modifer; 

class publicDemo1{

	public  String str = "Nitin kunmr";

	public static void main(String a[]){

		// System.out.println( str);   //error: non-static variable str cannot be referenced from a static context

		publicDemo1 ob =new publicDemo1();

		ob.demos();

		// ------------------------- --------

		publicdemo2 ob1 = new publicdemo2();

		System.out.println("punlic varible unther class "+ ob1.name);

	}
	public void  demos(){

		System.out.println(str);
	}
}