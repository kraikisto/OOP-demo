package tehtava4;

public class LinkitettyLista {
	
	Alkio alku;
	Alkio loppu;
	
	public LinkitettyLista() {	
	}
	
	public void lueAlustaLoppuun() {
		if (alku == null) {
			System.out.println("Lista on tyhj�.");
		} else {
			Alkio apu = alku;
			while (apu != null) {
				System.out.print(apu.luku + " ");
				apu = apu.seuraava;
			}
			System.out.println();
		}
	}
	public void lueLopustaAlkuun() { //sama juttu, vaan lopusta alkuun
		if (loppu == null) {
			System.out.println("Lista on tyhj�.");
		} else {
			Alkio apu = loppu;
			while (apu != null) {
				System.out.print(apu.luku + " ");
				apu = apu.edellinen;
			}
			System.out.println();
		}
	}
	
	public void lisaaAlkio(int luku) {
		Alkio uusi = new Alkio(luku);
		
		if (alku == null) {
			alku = uusi;
			loppu = uusi;
		} else {
			Alkio edellinen = loppu;
			loppu.seuraava = uusi;
			loppu = uusi;
			loppu.edellinen = edellinen;
		}
	}
	
	public boolean haeAlkio(int a) {
		Alkio apu = alku;
		while (apu != null) {
			if (apu.luku == a) {
				System.out.println("Alkio "+a+" l�ydetty listasta.");
				return true;
			}
			apu = apu.seuraava;
		}
		System.out.println("Alkiota "+a+" ei l�ydetty listasta.");
		return false;
	}
	
	public void poistaAlkio(int a) {
		Alkio apu = alku;
		Alkio edellinen = null;
		
		try {
		while (apu != null) {
			if (apu.luku == a) {
				if (edellinen == null) { //eli a on listan ensimm�inen luku
					alku = apu.seuraava;
				} else if (apu.seuraava == null) { //eli a on listan viimeinen luku
					loppu = edellinen;
					edellinen.seuraava = null;
				} else {
					edellinen.seuraava = apu.seuraava;
					apu.seuraava.edellinen = edellinen; //varmistaa ett� poistuu my�s toiseen suuntaan
				}
				System.out.println("Alkio "+ a +" poistettu listasta.");
				break;
			} else if (apu.seuraava.luku == a) {
				edellinen = apu;
			}
			apu = apu.seuraava;
			}
		} catch (NullPointerException e) {
			System.out.println("Alkiota "+ a+" ei l�ydetty listasta.");
		}
	}

}
