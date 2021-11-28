/*
Kenneth P. Figuerado III
DUE: 11/16/2021 @ 2359
Professor: Hemdal, Erik
Notes:
- WORKAROUND:    Ant does not allow for Systm.in so instead of that I changed the build.xml file to support the input
	- I left the scanner objects in the java project if there is a need for them when running it however they were not used during the running and compilation of the project
*/

package sieveProject;

//import java.util.Scanner;

public class SieveMain {
	public static void main(String args[]) {
		//Prompt user for input
		//Scanner scanner = new Scanner(System.in);
		//System.out.print("Please enter your maximum integer: "); 
		 
		 //Get user input
		 String maxNumber = args[0];
		 //scanner.close();
		 int maxNumInt = Integer.parseInt(maxNumber);
		 System.out.println("Calculating all prime numbers from 2 to " + maxNumber);
		 
		 //Create an array for telling whether or not an integer is prime. Need to add one here otherwise there's an out of bounds exception later on in the code with no easy fix
		 boolean isPrime[] = new boolean[maxNumInt + 1];
		 
		 //Initialize the array to be true
		 for(int i = 0; i <= maxNumInt; i++) {
			 isPrime[i] = true;
		 }
		 
		 for(int j = 2; j*j <= maxNumInt; j++ ) {
			 if(isPrime[j] == true) {
				 for(int k = j*j; k <= maxNumInt; k += j) {
					 isPrime[k] = false;
				 }
			 }
		 }
		 for(int l = 2; l <= maxNumInt; l++) {
			 if(isPrime[l] == true) {
				 System.out.println(l);
			 }
		 }
	}
}
