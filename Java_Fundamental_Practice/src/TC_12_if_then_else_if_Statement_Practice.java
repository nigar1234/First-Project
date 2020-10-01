/********************************
*Test Name: TC_12_if_then_else_if_Statement_Practice 
*Test Description:User practice if-then-else if statement
*Test Engineer Name: Nigar Chowdhury
*Date:8/4/2020
*Review History:
******************************************
*/

public class TC_12_if_then_else_if_Statement_Practice {

	public static void main(String[] args) {
		String sDay = "Monday";
		int iDay = 1;
		if(sDay.equals("Sunday")){
		System.out.println("Today is Sunday");
		}else if(sDay.equals("Saturday")){
		System.out.println("Today is not Saturday");
		}else{
		System.out.println("Today is a Weekday");
		}
		if(iDay==7){
		System.out.println("Today is Sunday");
		}else if(iDay==6){
		System.out.println("Today is Saturday");
		}else{
		System.out.println("Today is a Weekday");
		}	

	}

}

//***********************************************
//**************************EOF*********************
//******************************************************