package tehtava3;

class Kirves extends Tyokalu {
	
	public Kirves() {
		this.ladattava = false;
		this.teroitettava = true;
	}
	
	public void käytä() {
		if (this.akku <10 && this.terä < 10 ) {
			System.out.println("tsak tsak");
			this.terä = this.terä + 2;
		}
	}
}