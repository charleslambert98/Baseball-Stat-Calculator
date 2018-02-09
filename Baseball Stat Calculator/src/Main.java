/* Charles Lambert
 * CISC 181
 * Quiz 1
 * 13 February 2018
 */

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Player p = new Player();
		DecimalFormat numberFormat = new DecimalFormat("#.000");
		
		System.out.println("What is the player's name?");
		p.firstName = input.next();
		p.lastName = input.next();
		
		System.out.println("How many at bats does " + p.firstName + " " + p.lastName + " have?");
		p.ab = input.nextInt();
		
		System.out.println("How many hits does " + p.firstName + " " + p.lastName + " have?");
		p.hits = input.nextInt();
		
		System.out.println("How many doubles does " + p.firstName + " " + p.lastName + " have?");
		p.secondBase = input.nextInt();
		
		System.out.println("How many triples does " + p.firstName + " " + p.lastName + " have?");
		p.thirdBase = input.nextInt();
		
		System.out.println("How many home runs does " + p.firstName + " " + p.lastName + " have?");
		p.hr = input.nextInt();
		
		System.out.println("How many runs does " + p.firstName + " " + p.lastName + " have?");
		p.runs = input.nextInt();
		
		System.out.println("How many walks does " + p.firstName + " " + p.lastName + " have?");
		p.walks = input.nextInt();
		
		System.out.println("Batting Average: " + numberFormat.format(p.batAvCalc()));
		System.out.println("On Base Percentage: " + numberFormat.format(p.obpCalc()));
		System.out.println("Total Bases Achieved: " + p.totBaseCalc());
		System.out.println("Slugging Percentage: " + numberFormat.format(p.slgCalc()));
		System.out.println("On Base and Slugging Percentage: " + numberFormat.format(p.obsCalc()));
		
		input.close();
		
	}

}