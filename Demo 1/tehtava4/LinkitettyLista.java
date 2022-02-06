package tehtava4;

public class LinkitettyLista {
	
	Alkio alku;
	Alkio loppu;
	
	public LinkitettyLista() {	
	}
	
	public void lueLista() {
		if (alku == null) {
			System.out.println("Lista on tyhjä.");
		} else {
			Alkio apu = alku;
			while (apu != null) {
				System.out.print(apu.luku + " ");
				apu = apu.seuraava;
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
			loppu.seuraava = uusi;
			loppu = uusi;
		}
	}
	
	public boolean haeAlkio(int a) {
		Alkio apu = alku;
		while (apu != null) {
			if (apu.luku == a) {
				System.out.println("Alkio "+a+" löydetty listasta.");
				return true;
			}
			apu = apu.seuraava;
		}
		System.out.println("Alkiota "+a+" ei löydetty listasta.");
		return false;
	}
	
	public void poistaAlkio(int a) {
		Alkio apu = alku;
		Alkio edellinen = null;
		
		try {
		while (apu != null) {
			if (apu.luku == a) {
				if (edellinen == null) {
					alku = apu.seuraava;
				} else if (apu.seuraava == null) {
					loppu = edellinen;
					edellinen.seuraava = null;
				} else {
					edellinen.seuraava = apu.seuraava;
				}
				System.out.println("Alkio "+ a +" poistettu listasta.");
				break;
			} else if (apu.seuraava.luku == a) {
				edellinen = apu;
			}
			apu = apu.seuraava;
			}
		} catch (NullPointerException e) {
			System.out.println("Alkiota "+ a+" ei löydetty listasta.");
		}
	}

}
