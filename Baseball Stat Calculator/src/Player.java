public class Player {
	String firstName; //Player's First Name
	String lastName; //Player's Last Name
	double hits; //Number of Hits for Player
	double secondBase; //Number of Doubles for Player
	double thirdBase; //Number of Triples for Player
	double hr; //Number of Home Runs for Player
	double runs; //Number of Runs Scored for Player
	double walks; //Number of Base on Balls for Player
	double ab; //Number of At Bats for Player
	
	double batAv; //Batting Average of Player
	double obp; //On Base Percentage of Player
	double slg; //Slugging Percentage of Player
	double obs; //On Base and Slugging Percentages of Player
	double totBase; //Total Bases achieved by Player
	
	public double batAvCalc(){
		batAv = hits/ab; //Calculates Batting Average
		
		return batAv;
	}
	
	public double obpCalc() {
		obp = (hits + walks)/(ab + walks); //Calculates On Base Percentage
		
		return obp;
	}
	
	public double totBaseCalc() {
		double singles = hits - secondBase - thirdBase - hr;
		totBase = (singles + (2*secondBase) + (3*thirdBase) + (4*hr)); //Calculates Total Bases achieved by the Player

		return totBase;
	}
	
	public double slgCalc() {
		slg = (totBase)/ab; //Calculates the Slugging Percentage of the player
		
		return slg;
	}
	
	public double obsCalc() {
		obs = obp + slg; //Calculates the sum of the On Base Percentage and the Slugging Percentage
		
		return obs;
	}
	
}
