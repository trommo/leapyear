package info.sjd;

import java.util.Scanner;

public class LeapYear {




		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Input the year number between 1900 and 3000: ");
			
			int year = input.nextInt();
			
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			          System.out.println("Leap");
			      } else {
			          System.out.println("Regular");
			      }
		
			
		}
	}