/**
 * Java Course 4, Module 3, Norima Java Developer Course Capstone Project
 * 
 * A simple Automobile Insurance Policy and Claims Administration system (PAS) that manages customer automobile insurance policies and as well as accident claims for an insurance company. 
 * 
 * @author LemuelLimuco
 *
 */
public class PASApp {
	
	public static void main(String[] args) {
		Helper helper = new Helper(); //creates new helper object
		
		do {
			helper.displayMenu();
			switch(helper.getChoice()) {
			  case "1":
				  helper.createAccount();
				  break;
				  
			  case "2":
				  helper.getPolicyQuote();
				  break;
				  
			  case "3":
				  helper.cancelPolicy();
				  break;
				  
			  case "4": 
				  helper.fileClaim();
				  break;
				  
			  case "5": 
				  helper.searchAccount();
				  break;
				  
			  case "6":
				  helper.searchPolicy();
				  break;
				  
			  case "7":
				  helper.searchClaim();
				  break;
				  
			  case "8": 
				  helper.exitPasSystem();
				  break;
				
			  default:
				  helper.displayDefault();
				  break;
			}
			
		} while(!helper.getChoice().equals("8"));
	}
}

