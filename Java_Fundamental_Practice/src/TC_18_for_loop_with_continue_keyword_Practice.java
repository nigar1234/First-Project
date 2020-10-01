/********************************
*Test Name: TC_18_for_loop_with_continue_keyword_Practice 
*Test Description:User practice for loop with continue keyword
*Test Engineer Name: Nigar Chowdhury
*Date:8/4/2020
*Review History:
******************************************
*/
public class TC_18_for_loop_with_continue_keyword_Practice {

	public static void main(String[] args) {
		// This will print -- 0,1,2,4,5
		for(int Count = 0;Count<=5;Count++){
		if(Count==3){
		continue;
		}
		System.out.println("Count is ==> " + Count);
		}
		// This will just print -- 3
		System.out.println("<==== Next Count ====>");
		for(int Count = 0;Count<=5;Count++){
		if(Count==3){
		System.out.println("Count is ==> " + Count);
		continue;
		}
		}

		//Another way
		for ( int i = 10; i >=1; i -- )   
		  {
		 		  
		  if (i == 5)   
		   continue;
		  System.out.println(i);
		    
		  }

		
		//Another way
		
		for ( int i = 1; i <= 5; i ++)   
		  {
		   
		  if (i == 4) {   
		   continue;   
		  }  
		  if(i==3) {
			  continue;
		  }
		  System.out.println(i);    
		      
		  }

		
		
		
	}

}

//******************************************************
//**********************************************************
//****************************************************************