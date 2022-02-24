package tehtava3;

class Alkio {
	 public int luku;
	 public Alkio vasen; //vasen ja oikea ovat lapset
	 public Alkio oikea;
	
	
	public Alkio(int luku) {
		this.luku = luku;
		this.vasen = null;
		this.oikea = null;
	}

}


