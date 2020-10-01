/********************************
*Test Name: TC_20_do_while_loop_Practice 
*Test Description:User practice do while loop 
*Test Engineer Name: Nigar Chowdhury
*Date:8/4/2020
*Review History:
******************************************
*/
public class TC_20_do_while_loop_Practice {

	public static void main(String[] args) {
		
		int Count = 0;
		// This will print -- 5,10,15,20,25
		do{
		Count = Count + 5;
		System.out.println("Count is ==> "+ Count);
		}while(Count < 25);
		
		//Another one
		int CountOnce = 25;
		System.out.println("<==== Next Count ====>");
		// This will just print once
		do{
		CountOnce = CountOnce + 5;
		System.out.println("Count is ==> "+ CountOnce);
		}while(CountOnce < 25);
	}

}
