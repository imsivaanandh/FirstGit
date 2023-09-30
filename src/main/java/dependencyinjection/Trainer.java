package dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Trainer {

	private int id;
	private String name;
	@Autowired
	private Company company;
	
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
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", company=" + company + "]";
	}
	
	
}
