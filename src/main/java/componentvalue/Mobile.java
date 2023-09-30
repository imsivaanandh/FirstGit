package componentvalue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	@Value("1")
	private int id;
	@Value("Oppo")
	private String name;
	@Value("128gb")
	private String ram;
	@Autowired
	private Charger charger;
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", ram=" + ram + ", charger=" + charger + "]";
	}
	
	
}
