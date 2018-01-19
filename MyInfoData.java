/*File Name: MyInfoData.java
	Author: Edwin Y. Melendez Lopez #89139
	Description: A class that calls another class with the askUser and show methods.

				 
	History:	
			01/14/2018 - Program Created. EML
			01/14/2017 - Getters, setter and displays finalized. EML
			01/15/2017 - Created MyInfoData.java
			01/15/2017 - Finished editing MyInfo.java and MyInfoData.java
			01/17/2017 - Program Tested and Successfully runs. EML*/

public class MyInfoData
 {
	public static void main(String [] args){
		
		
		MyInfo myInfo = new MyInfo();
		
		myInfo.askUser();
		myInfo.show();
	}
}