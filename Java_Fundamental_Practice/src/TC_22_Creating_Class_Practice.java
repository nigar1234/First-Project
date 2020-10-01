/********************************
*Test Name: TC_22_Creating_Class_Practice 
*Test Description:User practice creating class 
*Test Engineer Name: Nigar Chowdhury
*Date:8/4/2020
*Review History:
******************************************
*/
public class TC_22_Creating_Class_Practice {

	public static void main(String[] args) {
		
		//Instantiate an object
		Car Toyota = new Car();
		
		Toyota.bLeftHandDrive = true;
		Toyota.iDoors = 4;
		Toyota.iGear = 5;
		Toyota.iHighestSpeed = 200;
		Toyota.iMake = 2014;
		Toyota.iTyres = 4;
		Toyota.sColor = "Black";
		Toyota.sTransmission = "Manual";
		Toyota.sModel = "Camry";
		
		//Call the Car class method
		Toyota.DisplayCharacterstics();
	}

}
//Class object in java practice
  class Car{
	 //Class member variable and field
	 String sModel;
	 int iGear;
	 int iHighestSpeed;
	 int iMake;
	 int iTyres;
	 int iDoors;
	 String sColor;
	 String sTransmission;
	 boolean bLeftHandDrive;
	 
	 public void DisplayCharacterstics(){
		 System.out.println("Model of the Car: " + sModel);
		 System.out.println("Number of gears in the Car: " + iGear);
		 System.out.println("Max speed of the Car: " + iHighestSpeed);
		 System.out.println("Color of the Car: " + sColor);
		 System.out.println("Make of the Car: " + iMake);
		 System.out.println("Transmission of the Car: " + sTransmission);
		 }
	  
 }
 
//**********************************************************
 //***********************************************************
 //********************************************************