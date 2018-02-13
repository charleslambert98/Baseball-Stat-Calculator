/* Charles Lambert
 * CISC 181
 * Quiz 1
 * 13 February 2018
 */

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Creates new scanner
		Player p = new Player(); //Creates instance of Player
		DecimalFormat numberFormat = new DecimalFormat("#.000"); //Formats the double values
		
		System.out.println("What is the player's name?"); //Requests Player name
		p.firstName = input.next();
		p.lastName = input.next();
		
		System.out.println("How many at bats does " + p.firstName + " " + p.lastName + " have?"); //Requests Player At Bats
		p.ab = input.nextInt();
		
		System.out.println("How many hits does " + p.firstName + " " + p.lastName + " have?"); //Requests Player Hits
		p.hits = input.nextInt();
		
		System.out.println("How many doubles does " + p.firstName + " " + p.lastName + " have?"); //Requests Player Doubles
		p.secondBase = input.nextInt();
		
		System.out.println("How many triples does " + p.firstName + " " + p.lastName + " have?"); //Requests Player Triples
		p.thirdBase = input.nextInt();
		
		System.out.println("How many home runs does " + p.firstName + " " + p.lastName + " have?"); //Requests Player Home Runs
		p.hr = input.nextInt();
		
		System.out.println("How many runs does " + p.firstName + " " + p.lastName + " have?"); //Requests Player Runs
		p.runs = input.nextInt();
		
		System.out.println("How many walks does " + p.firstName + " " + p.lastName + " have?"); //Requests Player Walks
		p.walks = input.nextInt();
		
		System.out.println("Batting Average: " + numberFormat.format(p.batAvCalc())); //Calls method to calculate Batting Average and formats/displays it
		System.out.println("On Base Percentage: " + numberFormat.format(p.obpCalc())); //Calls method to calculate On Base Percentage and formats/displays it
		System.out.println("Total Bases Achieved: " + p.totBaseCalc()); //Calls method to calculate Total Bases and formats/displays it
		System.out.println("Slugging Percentage: " + numberFormat.format(p.slgCalc())); //Calls method to calculate Slugging percentage and formats/displays it
		System.out.println("On Base and Slugging Percentage: " + numberFormat.format(p.obsCalc())); //Calls method to calculate Sum of Slugging and On Base Percentages and formats/displays it
		
		
		input.close(); //Stops Scanner
		
	}

}