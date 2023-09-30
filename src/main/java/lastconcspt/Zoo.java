package lastconcspt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {

	@Autowired
	@Qualifier(value = "lion")
	private Animal animal;
	
	public void zooSound() {
		animal.sound();
	}
}
