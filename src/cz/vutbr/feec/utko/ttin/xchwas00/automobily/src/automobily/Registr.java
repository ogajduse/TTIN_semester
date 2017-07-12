package automobily;

import java.util.HashMap;

public class Registr {
	private HashMap<String, Auto> reg = new HashMap<>();
	public void pridej(Auto auto){
		reg.put(auto.getVin(), auto.getNazev(), auto.getBarva());
		
	}
	
	public void pridej(Nakladni nakladni, Prives prives){
		reg.put(nakladni.getVin(), nakladni);
		reg.put(prives.getVinPrives(), prives);
	}
}
