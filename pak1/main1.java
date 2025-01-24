package pak1;

import  pak2.*;// when import the class onther package (folder)


public class main1{

	public static void main(String args[]){

		// same folder use in  two class to use package keyword to access the methods
		demo1 dm = new demo1(); 
		dm.momo();//hey so cuit............. 


		// differnt package  to use import ;
		pak2.main2 ob  = new main2();
//		ob.rajmaChabal(); //  ===========Bijnor cholo (main 2 class ) =========================

		// ob.tea();  //  no acess   the  unther package to unther class  |||||   Under ther packge  main2  no acces  demo2

		pak2.demo2  ob2 = new demo2();

		ob2.tea();


	}
}