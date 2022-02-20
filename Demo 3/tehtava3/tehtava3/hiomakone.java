package tehtava3;

class Hiomakone extends Tyokalu {
	
	public Hiomakone() {
		this.ladattava = true;
		this.teroitettava = false;
	}
	

	public void käytä() {
		if (this.akku <10 && this.terä < 10 ) {
			System.out.println("shh shh");
			this.akku = this.akku + 3;
		}
		
	}
	
	
}