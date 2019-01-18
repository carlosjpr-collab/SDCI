package core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.spotify.docker.client.exceptions.DockerException;

import entities.Node;

public class IHM {
	
	private static GCCore gcCore = new GCCore();
	
	public static void main( String[] args ) throws IOException, DockerException, InterruptedException
    {
//		menu();
		while(true) {
			gcCore.requeststate("/gw2");
			Thread.sleep(1000);
		}
    }
	
	public static void menu() throws IOException, DockerException, InterruptedException{
		while(true) {
			System.out.println("#### MENU ####");
			System.out.println("Choisir une option : ");
			System.out.println("1 - Visualiser la topologie du réseau");
			System.out.println("2 - Visualiser l'état d'une gateway");
			System.out.println("3 - Déployer une nouvelle gateway intermédiaire");
			
			Scanner sc = new Scanner(System.in);
			
			try {
				int choice = sc.nextInt();
			
				switch(choice) {
				case 1:
					gcCore.requestTopo();
					break;
				case 2:
					inspectGw();		
					break;
				case 3:
					break;
				default:
					System.out.println("Entrez un chiffre ENTRE 1 ET 3!");
				}
			}catch(InputMismatchException ex) {
				System.out.println("Entrez un chiffre !");
			}
		}
	}
	
	public List<Node> getTopo(){
		List<Node> list = new ArrayList<Node>();
		//list = gcCore.requestTopo();
		return list;
	}
	
	public static void inspectGw() throws DockerException, InterruptedException {
		System.out.println("Entre le nom de la gateway à inspecter");
		Scanner sc = new Scanner(System.in);
		String nameGateway = sc.nextLine();
		gcCore.requeststate(nameGateway);
	}
}
