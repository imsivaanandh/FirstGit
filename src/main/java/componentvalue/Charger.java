package componentvalue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Charger {

	@Value("101")
	private int id;
	@Value("C-type")
	private String name;
	@Override
	public String toString() {
		return "Charger [id=" + id + ", name=" + name + "]";
	}
	
	
}
