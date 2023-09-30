package withoutxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	@Value("1")
	private int id;
	@Value("OPPO")
	private String name;
	@Value("256gb")
	private String ram;
	@Autowired
	private Earphone earphone;
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", ram=" + ram + ", earphone=" + earphone + "]";
	}
	
	
}
