package tehtava2;
class Pelaaja {
    private int numero;
    private String nimi;
    private String paikka;
    
    public Pelaaja(int numero, String nimi, String paikka) {
        this.numero = numero;
        this.nimi = nimi;
        this.paikka = paikka;
    }
    public String getNimi(){
        return nimi;
    }
    public int getNumero(){
        return numero;
    }
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
	public String getPaikka() {
		return paikka;
	}
	public void setPaikka(String paikka) { //"Kenttäpelaaja" tai "maalivahti", jos haluaa parantaa niin voi lisätä paikkoja
		this.paikka = paikka;
	}

    

    @Override
    public String toString() {
        return numero + ", " + nimi + ", " + paikka;
    }

    
    public boolean equals(Pelaaja p) {
        if (this == p){
            return true;
        }
        if (p == null) {
            return false;
        }
        if (Pelaaja.class != p.getClass()) {
            return false;
        }

        Pelaaja other = (Pelaaja) p;
        return nimi.equals(other.nimi);
    }
    
    
    
}
