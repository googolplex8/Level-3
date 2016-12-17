package AP_Questions;

import java.util.ArrayList;

public class MasterOrder {
ArrayList <CookieOrder> order = new ArrayList <CookieOrder>();
public MasterOrder() {
	// TODO Auto-generated constructor stub
	
	}

public void addOrder(CookieOrder cookie){
	order.add(cookie);
}
public int getTotalBoxes(){
	int num = 0;
	for(CookieOrder r : order){
		num+=r.getNumBoxes();
	}
	return num;
}
ArrayList <CookieOrder> getOrders() {
	return order;
}

void setOrders(ArrayList <CookieOrder> order) {
	this.order = order;
}
}
