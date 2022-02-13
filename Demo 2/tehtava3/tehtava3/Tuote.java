package tehtava3;

class Tuote {
	private int id;
	private double hinta;
	private String nimi;
	private String ryhm‰;
	
	public Tuote(int id, double hinta, String nimi, String ryhm‰) {
		this.id = id;
		this.hinta = hinta;
		this.nimi = nimi;
		this.ryhm‰ = ryhm‰;
	}
	public Tuote(int id, double hinta, String nimi) {
		this.id = id;
		this.hinta = hinta;
		this.nimi = nimi;
		this.ryhm‰ = "ei ryhm‰‰";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		this.hinta = hinta;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getRyhm‰() {
		return ryhm‰;
	}

	public void setRyhm‰(String ryhm‰) {
		this.ryhm‰ = ryhm‰;
	}
	
	
}