package adapters;

import java.util.ArrayList;
import java.util.List;

import com.spotify.docker.client.DefaultDockerClient;
import com.spotify.docker.client.DockerClient;
import com.spotify.docker.client.exceptions.DockerException;
import com.spotify.docker.client.messages.Container;
import com.spotify.docker.client.messages.ContainerStats;

public class DockerAdapter {

	final DockerClient docker = new DefaultDockerClient("http://127.0.0.1:2375");

	private List<Container> cnts = new ArrayList<Container>();

	public List<Container> getContainersList() throws DockerException, InterruptedException {
		cnts = docker.listContainers();
		return cnts;
	}

	public ContainerStats getContainerStat(String name) throws DockerException, InterruptedException {
		getContainersList();
		for (Container c : cnts) {
			System.out.println(c.names().toString());
			if (c.names().get(0).equals(name)) {
				System.out.println(docker.stats(c.id()).cpuStats().cpuUsage().totalUsage());
				return null;
			}
		}
		System.out.println("No gateway found");
		return null;
	}
}
