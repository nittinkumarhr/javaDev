
public class stBuffer{

	public static void main( String args[]){

		// Strng Buffer -> Changeble ,thread safe 

		StringBuffer sbuff = new StringBuffer("NItin ");

		System.out.println(sbuff);// Nitin

		// upadate the string Buffer 

		StringBuffer newobj = sbuff.append(" Kumar");

		System.out.println(newobj);// Nitin kumar 
	}

}