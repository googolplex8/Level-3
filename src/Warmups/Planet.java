package Warmups;

import java.util.HashMap;

public class Planet {

	public static void main(String[] args) {
		HashMap <String, Integer> map = new HashMap<String, Integer>();
		map.put("Jupiter", 142800);
		map.put("Saturn", 120660);
		map.put("Uranus", 51118);
		map.put("Neptune", 49528);
		map.put("Earth", 12756);
		map.put("Venus", 12104);
		map.put("Mars", 6787);
		map.put("Mercury", 4879);
		map.put("Pluto", 2300);	
		Planet classy = new Planet();
		classy.killPluto(map);
		
	}
	public void planetNames(HashMap<String, Integer> planets){
		for(String x : planets.keySet()){
			System.out.println(x);
		}
	}
	public void findLargest(HashMap<String, Integer> planets){
		int largest = 0;
		String name = "";
		for(String x : planets.keySet()){
			if(planets.get(x)>largest){
				largest = planets.get(x);
				name = x;
			}
		}
		System.out.println(name);
	}
	public HashMap killPluto(HashMap<String, Integer> planets){
		for(String x : planets.keySet()){
			if(x.equals("Pluto")){
				planets.remove(x);
			}
		}
		System.out.println(planets);
		return planets;
		
	}
}
