/********************************
*Test Name: TC_14_Array_Practice 
*Test Description:User practice Array
*Test Engineer Name: Nigar Chowdhury
*Date:8/4/2020
*Review History:
******************************************
*/

public class TC_14_Array_Practice {

	public static void main(String[] args) {
	/*//Advance way
		
		String [] aMake = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
		//This is to store the size of the Array
		int iLength = aMake.length;
		System.out.println("Length of the Array is ==> " + iLength);
		//This is to access the first element of an array directly with it's position
		String sBMW = aMake[0];
		System.out.println("First value of the Array is ==> " + sBMW);
		//This is to access the last element of an Array
		String sHonda = aMake[iLength-1];
		System.out.println("Last value of the Array is ==> " + sHonda);
		//This is to print all the element values of an Array
		for(int i = 0;i<=iLength-1;i++){
		System.out.println("The value stored at position "+i+" in aMake array is ==> " + aMake[i]);

		*/
		/*//********************************************
		String sMake1, sMake2, sMake3, sMake4, sMake5;
		 sMake1= "ToyoTa";
		 sMake2= "Honda";
		sMake3 = "Mercedes";
		sMake4 = "BMW";
		sMake5 = "LandRover";
		 System.out.println("My car is a "  + sMake1 );
		 System.out.println("My car is a "  + sMake2 );
		 System.out.println("My car is a "  + sMake3 );
		 System.out.println("My car is a "  + sMake4 );
		 System.out.println("My car is a "  + sMake5 );
		//********************************************************
		 //***************************
		 */
		 
		String []  aMake = {"BMW", "AUDI", "TOYOTA","SUZUKI","HONDA"};
		   
		  //This is to store the size of the Array
		  int iLength = aMake.length;
		  
		    
		  System.out.println("Length of the Array is ==> " + iLength); 
		  
		  //This is to access the first element of an array directly with it's position
		  String sBMW = aMake[0];  
		  System.out.println("First value of the Array is ==> " + sBMW);
		  
		  //This is to access the last element of an Array  
		  String sHonda = aMake[iLength-1];
		  System.out.println("Last value of the Array is ==> " + sHonda);
		  
		  
		  String sMyToyota = aMake[iLength-3];
		  System.out.println("Last value of the Array is ==> " + sMyToyota);
		 
		
	}
	}



//*****************************************************************************
//*****************EOF
//********************************************************************