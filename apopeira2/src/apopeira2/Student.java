package apopeira2;

public class Student {
	
	String name =null;
	int distance =0;
	int familyIncome =0;
	int studentSiblings =0;
	boolean differentCity =false;
	int yearsRoom =0;
	int telephoneNumber =0;
	String emailAddress =null;
	private int points =0;
	int temp1 = 10 * yearsRoom;

		public void algorithm() {
			
			points = studentSiblings * 20;
			
			if (familyIncome ==0) {
				points = 4000;
			} else if (familyIncome < 10000) {
				points = points + 100;
			} else if (familyIncome < 15000) {
				
				points = points + 30;
			}
			
			if (differentCity == true) {
				
				points = points + 50;
			}
			
			points = points - temp1;
		}
/*
		if (yearsRoom == 4) {
			
			return void;   // na ton steiloume spiti tou
				
			}
	*/	
		public void apply() {
			
			
						
			
		}
		
		public void editInfo () {
			
			
			
			
		}
}


	