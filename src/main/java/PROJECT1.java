
//Fortune Teller Project: WCCI: Week #1 30JAN17
//Rebecca Kentosh

import java.util.Scanner;

public class PROJECT1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean anotherFortune1 = true;
		while (anotherFortune1 == true) {
			System.out.println("Please enter your first name:");
			String firstName = scanner.next();
			// int firstNameLength = firstName.length();
			// int firstNameEven = firstNameLength % 2; // confirm

			System.out.println(" Please enter your last name: ");
			String lastName = scanner.next();
			String fullName = (firstName + lastName);
			int fullNameLength = fullName.length();

			// AGE OF RETIREMENT
			System.out.println("What is your age?");
			int age = scanner.nextInt();
			int retireAge;

			if (age % 2 == 0) {
				retireAge = age + 10;
			} else {
				retireAge = age + 20;
			}
			// BIRTHMONTH SECTION
			System.out.println("What is your birth month?");
			String birthMonth = scanner.next();

			int monthIndex1 = 0;
			int monthIndex2 = 1;
			int compareResult = 1;
			int nameIndex1 = 0;
			int nameIndex2 = 1;
			int letterCheck = 1;
			String letterInName = "";
			int BankAcct = 0;

			while (monthIndex2 < 5 && compareResult != 0) {
				String letterOfMonth = birthMonth.substring(monthIndex1, monthIndex2);
				monthIndex1 = monthIndex1 + 1;
				monthIndex2 = monthIndex2 + 1;

				while (nameIndex2 < fullNameLength && letterCheck > 0 && compareResult != 0) {
					compareResult = letterOfMonth.compareTo(letterInName);
					letterInName = fullName.substring(nameIndex1, nameIndex2);
					nameIndex1 = nameIndex1 + 1;
					nameIndex2 = nameIndex2 + 1;

					if (compareResult == 0)
						;
					letterCheck = 1;
				}
			}
			// BANK ACCOUNT VALUES
			if (monthIndex1 == 0) {
				BankAcct = 100;
			} else if (monthIndex1 == 1) {
				BankAcct = 200;
			} else if (monthIndex1 == 2) {
				BankAcct = 300;
			} else
				BankAcct = 400;
			// ROYGBIV SECTION
			System.out.println("What is your favorite ROYGBIV color, OR enter 'Help'");
			String color = scanner.next();
			color = color.toUpperCase();
			while (color.equals("help") && !color.equals("R") && !color.equals("O") && !color.equals("Y")
					&& !color.equals("G") && !color.equals("B") && !color.equals("I") && !color.equals("V"))
				;
			System.out.println("Red, Yellow, Orange, Green, Blue, Indigo, Violet. "
					+ "Please enter the first letter of your favorite ROYGBIV color.");
			String color2 = scanner.next();
			color2 = color2.toUpperCase();
			// COLOR TRANSPORTATION VALUES
			// Stuck on doing Case execution amid looming deadline
			String transp = color2;
			if (color2.equals("R")) {
				transp = "car";
			} else if (color2.equals("O")) {
				transp = "boat";
			} else if (color2.equals("Y")) {
				transp = "bicycle";
			} else if (color2.equals("G")) {
				transp = "skateboard";
			} else if (color2.equals("B")) {
				transp = "bus";
			} else if (color2.equals("I")) {
				transp = "scooter";
			} else if (color2.equals("V")) {
				transp = "helicopter";
			} else {
				transp = "airplane";
			}
			System.out.println("How many siblings do you have?");
			int sibs = scanner.nextInt();
			String location;
			if (sibs <= 0) {
				location = ("Bahamas");
			} else if (sibs == 1) {
				location = ("Canada");
			} else if (sibs == 2) {
				location = ("Brazil");
			} else if (sibs == 3) {
				location = ("Thailand");
			} else {
				location = ("New Zealand");
			}
			// THE FORTUNE
			System.out.println("Congratulations, " + firstName + " " + lastName + " you will retire at age " + retireAge
					+ " with $" + BankAcct + " in the bank, a vacation home in " + location + " and a " + transp + "!");
			// TRY AGAIN?
			System.out.println("Would you like to play the FortuneTeller game again?" + "(Y or N)");
			String anotherFortune11 = scanner.next();
			anotherFortune11 = anotherFortune11.toUpperCase();

			if (anotherFortune11.equals("N"))
				;
			{
				System.out.println("Good Luck until next time!");
				scanner.close();
			}
			if (anotherFortune11.equals("Y"))
				;
			System.out.println("Here we go!");
		}
	}
}
