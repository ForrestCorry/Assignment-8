package com.ssa.assignemnt.day8;

import java.util.Scanner;

public class ClothingStore {
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userInput = null;
		int numberInput = 0;
		boolean userFailed = false;
		
		SportsJersey myJersey = new SportsJersey();
		
		System.out.println("You may customize your' own Jersey");
		
		System.out.println("What fabric would you like your jersey?");
		userInput = sc.nextLine();
		myJersey.setFabric(userInput);
		
		System.out.println("What sport would you like to make a jersey for?");
		userInput = sc.nextLine();
		myJersey.setSport(userInput);
		
		System.out.println("What team jersey would you like?");
		userInput = sc.nextLine();
		myJersey.setTeam(userInput);
		
		System.out.println("What team logo would you like?");
		userInput = sc.nextLine();
		myJersey.setTeamLogo(userInput);
		
		System.out.println("Would you like a home jersey or away?");
		userInput = sc.nextLine();
		myJersey.setHomeOrAway(userInput);
		
		System.out.println("What Sleeve length would you prefer?\n -long\n -mid\n -short");
		userInput = sc.nextLine();
		myJersey.setSleeveLength(userInput);
		
		System.out.println("What size would you like your jersey?");
		userInput = sc.nextLine();
		myJersey.setSize(userInput);
		
		System.out.println("What would you like the primary color to be?");
		userInput = sc.nextLine();
		myJersey.setPrimaryColor(userInput);
		
		System.out.println("What would you like the secondary color to be?");
		userInput = sc.nextLine();
		myJersey.setSecondaryColor(userInput);
		
		System.out.println("What name would you like printed on the back?");
		userInput = sc.nextLine();
		myJersey.setNameOnBack(userInput);
		
		do {
			System.out.println("What number would you like on the back?");
			userInput = sc.nextLine();
			
			userFailed = numberIsValid(userInput);
			
		} while (userFailed);
		
		numberInput = Integer.parseInt(userInput);
		myJersey.setNumberOnBack(numberInput);
		
		System.out.println(myJersey.toString());
		
		
		
	}//main
		
	public static boolean numberIsValid(String numberInput)	{
		
		try {
			int number = Integer.parseInt(numberInput);
			return false;
		} catch (NumberFormatException e) {
			return true;
			
		}
		
	}

}//class
