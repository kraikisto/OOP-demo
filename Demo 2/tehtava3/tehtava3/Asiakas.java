package tehtava3;

import java.util.ArrayList;
import java.util.Scanner;

class Asiakas extends Henkilo{
	private String osoite;
	private ArrayList<Tuote> ostoskori = new ArrayList<Tuote>();
	
	public Asiakas(int id, String nimi, String osoite) {
		super(id, nimi);
		this.osoite = osoite;
	}

	public String getOsoite() {
		return osoite;
	}

	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}

	public ArrayList<Tuote> getOstoskori() {
		return ostoskori;
	}

//huom. setOstoskori() metodia ei tarvita
	
	public double yhteisHinta() {
		double summa = 0;
		for (Tuote i : ostoskori) {
			summa = summa + i.getHinta();
		}
		return summa;
	}
	public void lis‰‰Ostoskoriin(Tuote ostos) {
		ostoskori.add(ostos);
	}
	
	public void poistaOstoskorista(Tuote ostos) {
		ostoskori.remove(ostos);
	}
	
	public void teeMaksu() {
		Scanner lukija = new Scanner(System.in);
		System.out.println("Syˆt‰ pankkikortin numero: ");
		int pankkikortinNro = lukija.nextInt();
		OstosTapahtuma maksu = new OstosTapahtuma( this.getId(), this.yhteisHinta(), pankkikortinNro);
		ostoskori = new ArrayList<Tuote>(); //tyhjent‰‰ ostoskorin
		//maksun voisi tallentaa jotenkin
	}
}