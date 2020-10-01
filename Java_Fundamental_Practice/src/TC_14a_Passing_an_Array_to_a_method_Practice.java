/********************************
*Test Name: TC_14a_Passing_an_Array_to_a_method_Practice 
*Test Description:User practice passing an Array to a method
*Test Engineer Name: Nigar Chowdhury
*Date:8/4/2020
*Review History:
******************************************
*/
public class TC_14a_Passing_an_Array_to_a_method_Practice {

	
	//This accept Array as an argument of type String
			public static void Print_Array(String[] array){
			for(int i = 0;i<=array.length-1;i++){
			System.out.println("Printing all the values of an Array ==> " + array[i]);
			}
			}
			
	public static void main(String[] args) {
		//Declaring an Array
		String [] aMake = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
		// Calling Print Array method by passing an Array as a parameter
		Print_Array(aMake);
		
		/*//This accept Array as an argument of type String
		public static void Print_Array(String[] array){
		for(int i = 0;i<=array.length-1;i++){
		System.out.println("Printing all the values of an Array ==> " + array[i]);
		*/
	
		}
}
//********************************************************************
//    EOF
//**********************************************************************