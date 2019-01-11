package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Node;

public class IHM {
	
	private GCCore gcCore = new GCCore();
	
	public static void main( String[] args )
    {
		menu();
    }
	
	public static void menu(){
		while(true) {
			System.out.println("#### MENU ####");
			System.out.println("Choisir une option : ");
			System.out.println("1 - Visualiser la topologie du réseau");
			System.out.println("2 - Déployer une nouvelle gateway intermédiaire");
			System.out.println("3 - Visualiser l'état d'une gateway");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				System.out.println("Entrez un chiffre !");
			}
		}
	}
	
	public List<Node> getTopo(){
		List<Node> list = new ArrayList<Node>();
		//list = gcCore.requestTopo();
		return list;
	}
}
