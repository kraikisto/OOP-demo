package tehtava3;

class Saha extends Tyokalu {
	
	public Saha() {
		this.ladattava = true;
		this.teroitettava = true;
	}
	
	public void k�yt�() {
		if (this.akku <10 && this.ter� < 10 ) {
			System.out.println("shii shii");
			this.akku = this.akku + 4;
			this.ter� = this.ter� + 1;
		}
		
	}
}