package entities;

import java.util.Map;

public class Switch extends Node {

	private Map<Integer, String> listPorts;

	public Switch(Map<Integer, String> listPorts) {
		super();
		this.listPorts = listPorts;
	}

	public Map<Integer, String> getListPorts() {
		return listPorts;
	}

	public void setListPorts(Map<Integer, String> listPorts) {
		this.listPorts = listPorts;
	}
	
	
}
