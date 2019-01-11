package core;

import java.util.ArrayList;
import java.util.List;

import adapters.NFVMANOAdapter;
import adapters.SDNCTRLAdapter;
import entities.Node;

public class GCCore {
	
	private SDNCTRLAdapter sdnAdapter;
	private NFVMANOAdapter nfvAdapter;
	//private List<Requests ? >
	
	public GCCore() {
		sdnAdapter = new SDNCTRLAdapter();
		nfvAdapter = new NFVMANOAdapter();
	}
	
	public List<Node> requestTopo(){
		return sdnAdapter.getTopo() ;
	}
	
}
