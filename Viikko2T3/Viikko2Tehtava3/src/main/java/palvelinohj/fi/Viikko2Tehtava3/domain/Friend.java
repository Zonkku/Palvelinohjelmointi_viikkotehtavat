package palvelinohj.fi.Viikko2Tehtava3.domain;

public class Friend {
	public String name;
	
	
	public Friend () {
		super();
	}

	
	public Friend (String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}
	
	

}
