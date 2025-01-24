// public acces the  (anywhere use   

package modifer; 

class protecteddemo1{

	 String str = "I am protected";

	public static void main(String a[]){

		// System.out.println( str);   //error: non-static variable str cannot be referenced from a static context
		protecteddemo1 ob =new protecteddemo1();

		ob.demos();

	}
	public void  demos(){

		System.out.println(str);
	}
}