package entities;

public class Node {

	private String name;
	private String ipAdress;
	private String type;
	
	

	public Node(String name, String ipAdress, String type) {
		super();
		this.name = name;
		this.ipAdress = ipAdress;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIpAdress() {
		return ipAdress;
	}

	public void setIpAdress(String ipAdress) {
		this.ipAdress = ipAdress;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Node : " + this.name;
	}

	
}
