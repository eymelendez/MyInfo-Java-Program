/*

File Name: MyInfo.java
	Author: Edwin Y. Melendez Lopez #89139
	Description: Class that ask the user for information and then displays it.

				 
	History:	
			01/14/2018 - Program Created. EML
			01/14/2017 - Getters, setter and displays finalized. EML
			01/15/2017 - Created MyInfoData.java
			01/15/2017 - Finished editing MyInfo.java and MyInfoData.java
			01/17/2017 - Program Tested and Successfully runs. EML*/


import java.util.Scanner;
import java.util.*;

// Public class that can be used by anybody.
public class MyInfo {
	
	private String firstName;
	private String lastName;
	private String birthDate;
	private String bornPlace;
	
	public MyInfo()
	{
		this("Mattew", "Nieves", "March 23", "Arecibo");
	}
	
	public MyInfo(String aFirstName, String aLastName, String aBirthDate, String aBornPlace)
	{
		setFirstName(aFirstName);
		setLastName(aLastName);
		setBirthDate(aBirthDate);
		setBornPlace(aBornPlace);
		
	} // end MyInfo
	
	
	// Setters
	public void setFirstName(String aFirstName)
	{
		firstName = aFirstName;
	}
	
	public void setLastName(String aLastName)
	{
		lastName = aLastName;
	}
	
	public void setBirthDate(String aBirthDate)
	{
		birthDate = aBirthDate;
	}
	
	public void setBornPlace(String aBornPlace)
	{
		bornPlace = aBornPlace;
	}
	
	// Getters
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getBirthDate()
	{
		return birthDate;
	}
	
	public String getBornPlace()
	{
		return bornPlace;
	}
	
	// Ask the user for the data to be entered
	
	public void askUser()
	{
	
	System.out.println("Welcome!");
									  // System.in is basically C++ 's cin >>
									  
	Scanner userInput = new Scanner(System.in); // new object of type Scanner
	
	System.out.print("Entre su nombre: ");
	firstName = userInput.nextLine();
	
	System.out.print("Entre su apellido: ");
	lastName = userInput.nextLine();
	
	System.out.print("Entre su fecha de nacimiento ( Formato dd/mm/aa ) : " );
	birthDate = userInput.nextLine();
	
	System.out.print("Entre su lugar de nacimiento: ");
	bornPlace = userInput.nextLine();

	} // end askUser Method
	
	
	public void show()
	{
		System.out.printf("Display Information:\n\n");
		System.out.printf("Nombre: %s%n", firstName);
		System.out.printf("Apellido: %s%n", lastName);
		System.out.printf("Fecha Nacimiento: %s%n", birthDate);
		System.out.printf("Lugar de Nacimiento: %s%n", bornPlace);
		
	} // end show() Method
	
	
	
	
	
	
	
} // end