package withoutxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Earphone {

	@Value("101")
	private int id;
	@Value("boAt")
	private String name;
	@Value("3.5-A.J")
	private String type;
	@Override
	public String toString() {
		return "Earphone [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	
}
