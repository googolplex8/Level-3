import java.rmi.RemoteException;
import java.util.ArrayList;

public class OncogeneDetector {
	
public boolean isOncogene(ArrayList <String> healthySequence, ArrayList <String> cancerSequence, String candidate){
	boolean isOncogene = false;
	int healthyNum = 0;
	int cancerNum = 0;
	System.out.println(healthySequence);
	if(candidate==""){
		return false;
	}
	else if(healthySequence.size()==0){
		throw new IllegalArgumentException("healthySequences must contain at least one element");
	}
	else if(cancerSequence.size()==0){
		throw new IllegalArgumentException("cancerSequences must contain at least one element");
	}
	for(String x: healthySequence){
		if (x.contains(candidate)) {
			healthyNum+=1;
		}
	}
	for(String x: cancerSequence){
		if (x.contains(candidate)) {
			cancerNum+=1;
		}
	}
	if(healthyNum>=cancerNum){
		isOncogene = false;
	}
	else{
		isOncogene=true;
	}
	return isOncogene;
	
}
}
// xghxgh xgh