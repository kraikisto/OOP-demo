package tehtava3;

class Puukko extends Tyokalu {
	
	public Puukko() {
		this.ladattava = false;
		this.teroitettava = true;
	}
	
	public void k�yt�() {
		if (this.akku <10 && this.ter� < 10 ) {
			System.out.println("tsiu tsiu");
			this.ter� = this.ter� + 3;
		}
			
	}
}