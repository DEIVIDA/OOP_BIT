import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Vykdymas {

	public static void main(String[] args) {

		Ziurkenas mikis = new Ziurkenas("Mikis");
		mikis.setUodegosIlgis(10);
		mikis.setSpalva("baltas");

		Ziurkenas minis = new Ziurkenas("Minis");
		minis.setUodegosIlgis(8);
		minis.setSpalva("juodas");

		Ziurkenas rudis = new Ziurkenas("Rudis");
		rudis.setUodegosIlgis(3);
		rudis.setSpalva("margas");

		Zuvis aukse = new Zuvis("Aukse");
		aukse.setPelekuKiekis(6);

		Zuvis samas = new Zuvis("Samas");
		samas.setPelekuKiekis(12);

		List<Gyvunas> listG = new LinkedList<>();
		
		listG.add(rudis);
		listG.add(samas);
		listG.add(mikis);
		listG.add(aukse);
		listG.add(minis);
		

		System.out.println("Gyvunu sarasas: ");
		for (Gyvunas g : listG) {
		    System.out.println(g);
		}

		/*
		 * Gyvunu saraso isrikiavimas pagal tipa ir varda
		 */
		Collections.sort(listG);
		System.out.println("Surikiuotas gyvunu sarasas: ");
		for (Gyvunas g : listG) {
		    System.out.println(g);
		}	
		
		/*
		 * Gyvuno paieska pagal varda
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Gyvuno paieska. Iveskite gyvuno varda: ");
		String vardas = sc.nextLine();
		
		Gyvunas.searchByName(listG, vardas);
				
		sc.close();
		
	}

}
