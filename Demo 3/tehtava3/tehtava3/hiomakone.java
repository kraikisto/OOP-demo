package tehtava3;

class Hiomakone extends Tyokalu {
	
	public Hiomakone() {
		this.ladattava = true;
		this.teroitettava = false;
	}
	

	public void k�yt�() {
		if (this.akku <10 && this.ter� < 10 ) {
			System.out.println("shh shh");
			this.akku = this.akku + 3;
		}
		
	}
	
	
}