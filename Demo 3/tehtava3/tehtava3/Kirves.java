package tehtava3;

class Kirves extends Tyokalu {
	
	public Kirves() {
		this.ladattava = false;
		this.teroitettava = true;
	}
	
	public void k�yt�() {
		if (this.akku <10 && this.ter� < 10 ) {
			System.out.println("tsak tsak");
			this.ter� = this.ter� + 2;
		}
	}
}