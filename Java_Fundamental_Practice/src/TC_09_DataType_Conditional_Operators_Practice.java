/********************************
*Test Name:TC_09_DataType_Conditional_Operators_Practice 
*Test Description:User practice Conditional operator
*Test Engineer Name: Nigar Chowdhury
*Date:8/4/2020
*Review History:
******************************************
*/


public class TC_09_DataType_Conditional_Operators_Practice {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		boolean bValue;
		int iValue;
		
		bValue = (c == a + b) ? true: false;
		System.out.println( "The boolean value of the variable 'bValue' is : " + bValue ); //true
		
		iValue = ((c == a + b)) ? 1:2;
		System.out.println( "The int Value of the variable iValue is : " + iValue ); //1
		
		//This is a use of Not Logical Operator
		iValue = (!(c == b + a)) ? 1:2;
		System.out.println( "The int Value of the variable iValue is : " + iValue ); //2		
		

	}

}
//***********************************************************************
//*****************EOF**************************************************
//**************************************************************************