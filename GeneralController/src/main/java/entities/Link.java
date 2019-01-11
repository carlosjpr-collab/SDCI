package entities;

public class Link {
	
	private String endpoint1;
	private String endpoint2;

	
	
	public Link(String endpoint1, String endpoint2) {
		this.endpoint1 = endpoint1;
		this.endpoint2 = endpoint2;
	}

	public String getEndpoint1() {
		return endpoint1;
	}
	public void setEndpoint1(String endpoint1) {
		this.endpoint1 = endpoint1;
	}
	public String getEndpoint2() {
		return endpoint2;
	}
	public void setEndpoint2(String endpoint2) {
		this.endpoint2 = endpoint2;
	}
	
	@Override
	public String toString() {
		return this.endpoint1 + " <---> " + this.endpoint2;
	}
}
