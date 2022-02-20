package tehtava3;

class Puukko extends Tyokalu {
	
	public Puukko() {
		this.ladattava = false;
		this.teroitettava = true;
	}
	
	public void käytä() {
		if (this.akku <10 && this.terä < 10 ) {
			System.out.println("tsiu tsiu");
			this.terä = this.terä + 3;
		}
			
	}
}