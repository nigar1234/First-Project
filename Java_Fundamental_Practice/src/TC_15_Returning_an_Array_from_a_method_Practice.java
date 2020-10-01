import java.util.Arrays;

/********************************
*Test Name: TC_15_Returning_an_Array_from_a_method_Practice 
*Test Description:User practice Returning an Array from a method
*Test Engineer Name: Nigar Chowdhury
*Date:8/4/2020
*Review History:
******************************************
*/
public class TC_15_Returning_an_Array_from_a_method_Practice {

	//softwaretestinghelp.com
	//This method returns an Array of type String
			public static String[] ReturnArray() {
			String [] aArray = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
			return aArray;
			}
	
	public static void main (String[] args) {
		String[] aMake = ReturnArray();
		System.out.println("Return array" + Arrays.toString(aMake));
		
	
		
		//Akter bhai
		/*public static void main (String[] args) {
		 * String[] aMake = ReturnArray();
		for(int i = 0;i<=aMake.length-1;i++){
		System.out.println("Printing all the values of an Array ==> " + aMake[i]);
		}
		}
		//This method returns an Array of type String
		public static String[] ReturnArray() {
		String [] aArray = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};
		return aArray;
		}
		}
		 */
		
		
			}
		
		
		}
		




//*************************************************************************
//      EOF
//*************************************************************************