/********************************
*Test Name: TC_19_while_loop_Practice 
*Test Description:User practice while loop 
*Test Engineer Name: Nigar Chowdhury
*Date:8/4/2020
*Review History:
******************************************
*/
public class TC_19_while_loop_Practice {

	public static void main(String[] args) {
		
		//This program will print 5,10,15,20
		//Variable declaration and initialization
		int Count = 0;
		
		// This will print -- 5,10,15,20,25
		while(Count < 25){
		Count = Count + 5;
		System.out.println("Count is ==> "+ Count);
		}
		
		//Another one
		int CountOnce = 25;
		System.out.println("<==== Next Count ====>");
		
		// This will not print count even once
		while(CountOnce < 25){
		CountOnce = CountOnce + 5;
		System.out.println("Count is ==> "+ CountOnce);
		}

	}

}
