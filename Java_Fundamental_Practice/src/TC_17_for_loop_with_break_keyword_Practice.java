/********************************
*Test Name: TC_17_for_loop_with_break_keyword_Practice 
*Test Description:User practice for loop with break keyword
*Test Engineer Name: Nigar Chowdhury
*Date:8/4/2020
*Review History:
******************************************
*/
public class TC_17_for_loop_with_break_keyword_Practice {

	public static void main(String[] args) {
		// This will print -- 0,1,2,3,4,5
		for(int Count = 0;Count<=10;Count++){
		if(Count==6){
		break;
		}
		System.out.println("Count is ==> " + Count );
		}
		System.out.println("You have exited the loop");
		
		// Another way
		
		for ( int i = 10; i >=1; i -- )   
		  {
		  System.out.println(i); 
		  
		  if (i == 5)   
		   break;
		   
		    
		  }
		
		
		
	}

}

//****************************************************************
//********EOF******************************
//****************************************************