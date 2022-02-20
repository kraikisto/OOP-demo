package tehtava3;

import java.util.ArrayList;

class Tyokalupakki {
	 private ArrayList<Tyokalu> tyokalut = new ArrayList<Tyokalu>();
	
	public void teroita() {
		for (Tyokalu tyokalu : this.tyokalut) {
			if (tyokalu.teroitettava) {
				tyokalu.ter� = 0;
			}
		}
	}
	
	public void lataa() {
		for (Tyokalu tyokalu : this.tyokalut) {
			if (tyokalu.ladattava) {
				tyokalu.akku = 0;
			}
		}
	}
	
	public void lis��Ty�kalu(Tyokalu ty�kalu) {
		this.tyokalut.add(ty�kalu);
	}
}