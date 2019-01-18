package core;

import java.io.IOException;

import com.spotify.docker.client.exceptions.DockerException;
import com.spotify.docker.client.messages.Container;

import adapters.DockerAdapter;
import adapters.NFVMANOAdapter;
import adapters.SDNCTRLAdapter;

public class GCCore {

	private SDNCTRLAdapter sdnAdapter;
	private NFVMANOAdapter nfvAdapter;
	private DockerAdapter dockerAdapter;
	// private List<Requests ? >

	public GCCore() {
		sdnAdapter = new SDNCTRLAdapter();
		nfvAdapter = new NFVMANOAdapter();
		dockerAdapter = new DockerAdapter();
	}

	public void requestTopo() throws IOException {
		sdnAdapter.getTopoStatic();
	}

	public void requeststate(String name) throws DockerException, InterruptedException {
		dockerAdapter.getContainerStat(name);
	}

}
