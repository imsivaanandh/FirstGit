package componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("1")
	private int id;
	@Value("Dhoni")
	private String name;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}


	public static void duty() {
		System.out.println("is to study");
	}
}
