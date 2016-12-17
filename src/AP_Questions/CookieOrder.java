package AP_Questions;

public class CookieOrder {
	private String variety;
	private int numBoxes;
	public CookieOrder(String variety, int numBoxes) {
		// TODO Auto-generated constructor stub
		this.setVariety(variety);
		this.setNumBoxes(numBoxes);
	}
	String getVariety() {
		return variety;
	}
	void setVariety(String variety) {
		this.variety = variety;
	}
	int getNumBoxes() {
		return numBoxes;
	}
	void setNumBoxes(int numBoxes) {
		this.numBoxes = numBoxes;
	}

}
