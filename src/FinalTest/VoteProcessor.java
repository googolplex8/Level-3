package FinalTest;
import java.util.ArrayList;
import java.util.HashMap;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		HashMap <String, Integer> tally = new HashMap <String, Integer>(); 
		String winner = "";
		for(String x : votes){
			if(x.equalsIgnoreCase("pope francis")){
				//System.out.println("POPE");
				if(tally.containsKey("pope francis")){
					int value = tally.get("pope francis");
					tally.put("pope francis", value+=1);
					//System.out.println("adding pope");
				}
				else{
					tally.put("pope francis", 1);
					//System.out.println("making pope");
				}
			}
			else if(x.equalsIgnoreCase("edward snowden")){
				//System.out.println("SNOWDEN");
				if(tally.containsKey("edward snowden")){
					int value = tally.get("edward snowden");
					tally.put("edward snowden", value+=1);
					//System.out.println("adding snowden");
				}
				else{
					tally.put("edward snowden", 1);
					//System.out.println("making snowden");
				}
			}
		}
		
		System.out.println("Pope: " + tally.get("pope francis"));
		System.out.println("Edward: "+ tally.get("edward snowden"));
		
			if(tally.get("pope francis")>tally.get("edward snowden")){
				winner = "pope francis";
			}
			else if(tally.get("pope francis")==tally.get("edward snowden")){
				winner= "TIE";
			}
			else{
				winner = "edward snowden";
			}
		System.out.println(winner);
		return winner;
	}

}
