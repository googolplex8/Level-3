
public class Snake {
	private int viciousness;
	private boolean venemous;

	public Snake(int viciousness, boolean venemous) {
		this.viciousness = viciousness;
		this.venemous = venemous;
	}

	public static void main(String[] args) {

	}

	int getViciousness() {
		return viciousness;
	}

	void setViciousness(int viciousness) {
		this.viciousness = viciousness;
	}

	boolean isVenemous() {
		return venemous;
	}

	void setVenemous(boolean venemous) {
		this.venemous = venemous;
	}
}
