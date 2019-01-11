package adapters;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import entities.Link;
import entities.Node;

public class SDNCTRLAdapter {
	
	public void getTopoStatic() throws IOException {
		
		ArrayList<Node> nodes = new ArrayList<Node>();
		ArrayList<Link> links = new ArrayList<Link>();
		
		System.out.println(System.getProperty("user.dir"));
		FileReader f = new FileReader("./src/main/resource/topo.txt");
		BufferedReader reader = new BufferedReader(f);
		
		String currentLine;
		while((currentLine = reader.readLine()) != null) {
			String[] tab = currentLine.split(" ");
			if(tab[0].equals("n")) {
				Node n;
				if(tab.length == 3) {
					n = new Node(tab[1], tab[2], "host");
				}
				else {
					n = new Node(tab[1], null, "switch-dc");
				}
				nodes.add(n);
			}
			else if(tab[0].equals("l")){	
				Link l = new Link(tab[1], tab[2]);
				links.add(l);
			}
		}
		
		System.out.println(nodes.toString());
		System.out.println(links.toString());

		
		f.close();
	}
}
