package tehtava3;

class Saha extends Tyokalu {
	
	public Saha() {
		this.ladattava = true;
		this.teroitettava = true;
	}
	
	public void käytä() {
		if (this.akku <10 && this.terä < 10 ) {
			System.out.println("shii shii");
			this.akku = this.akku + 4;
			this.terä = this.terä + 1;
		}
		
	}
}