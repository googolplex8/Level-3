package AP_Questions;

import java.util.ArrayList;

public class Trip {
	ArrayList<Flight> flights = new ArrayList<Flight>();



	public void add(Flight f) {
		flights.add(f);
	}

	public int getNumberOfFlights() {
		return flights.size();
	}

	public void clear() {
		flights.clear();
	}

	public int getDuration() {
		int duration = 0;
		if (flights.size() == 0) {
			return duration;
		} else {
			Time begin = flights.get(0).getDepartureTime();
			Time end = flights.get(flights.size() - 1).getArrivalTime();
			duration += begin.minutesUntil(end);
			return duration;
		}
	}

	public int getShortestLayover() {
		int shortest= -1;
		
		if(flights.size() == 0 || flights.size()==1){
			return -1;
		}
		else {
			
			for (int i = 0; i < flights.size()-1; i++) {
				Time begin = flights.get(i).getArrivalTime();
				Time end = flights.get(i+1).getDepartureTime();
				if(shortest==-1){
					shortest=begin.minutesUntil(end);
					System.out.println("" + begin.minutesUntil(end));
				}
				
				if(shortest>begin.minutesUntil(end)){
					shortest=begin.minutesUntil(end);
					System.out.println("" + begin.minutesUntil(end));
				}
				else{
					
				}
				System.out.println(shortest);
			}
			return shortest;
		}
	}
}
