package tehtava3;

class Ty�ntekij� extends Henkilo {
	private String teht�v�;

	public Ty�ntekij�(int id, String nimi, String teht�v�) {
		super(id, nimi);
		this.teht�v� = teht�v�;
	}

	public String getTeht�v�() {
		return teht�v�;
	}

	public void setTeht�v�(String teht�v�) {
		this.teht�v� = teht�v�;
	}

	public void lis��Varastoon(Tuote tuote, Varasto varasto) {
		varasto.getTuotteet().add(tuote);
	}

	public void poistaVarastosta(Tuote tuote, Varasto varasto) {
		varasto.getTuotteet().remove(tuote);
	}
	

}