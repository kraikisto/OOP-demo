package tehtava3;

class Työntekijä extends Henkilo {
	private String tehtävä;

	public Työntekijä(int id, String nimi, String tehtävä) {
		super(id, nimi);
		this.tehtävä = tehtävä;
	}

	public String getTehtävä() {
		return tehtävä;
	}

	public void setTehtävä(String tehtävä) {
		this.tehtävä = tehtävä;
	}

	public void lisääVarastoon(Tuote tuote, Varasto varasto) {
		varasto.getTuotteet().add(tuote);
	}

	public void poistaVarastosta(Tuote tuote, Varasto varasto) {
		varasto.getTuotteet().remove(tuote);
	}
	

}