package tehtava2;

import java.util.ArrayList;
import java.util.Scanner;

public class Paivakirja {
	
	private String salasana;
	private ArrayList<String> tekstit;
	Scanner lukija;
	
	public Paivakirja(String salasana) {
		this.salasana = salasana;
		tekstit = new ArrayList<>();
		lukija = new Scanner(System.in);
	}
	
	public ArrayList<String> lueKirja() {
		System.out.println("Sy�t� salasana: ");
		if (lukija.nextLine().equals(salasana)) {
			return tekstit; 
		} else {
			System.out.println("V��r� salasana");
			return null; //metodin t�ytyy palauttaa 
		}
	}
	
	public void kirjoita(String teksti) {
		System.out.println("Sy�t� salasana: ");
		if (lukija.nextLine().equals(salasana)) {
			tekstit.add(teksti);
			System.out.println("Sy�tt�m�si teksti lis�tty p�iv�kirjaan.");
		} else {
			System.out.println("V��r� salasana");
		}
	}

}
