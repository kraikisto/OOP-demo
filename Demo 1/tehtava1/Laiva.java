package tehtava1;

public class Laiva {
	String nimi;
	double pituus;
	double syvays;
	double nopeus;
	

	public Laiva(String nimi, double pituus, double syvays, double nopeus) {
		this.nimi = nimi;
		this.pituus = pituus;
		this.syvays = syvays;
		this.nopeus = nopeus;
	}
	

	public double laskeKesto(double matka) {
		return matka / nopeus; //matka pit‰‰ antaa merimaileissa jotta vastaus on oikea
	}
}
