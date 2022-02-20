package tehtava3;

import java.util.ArrayList;

class Tyokalupakki {
	 private ArrayList<Tyokalu> tyokalut = new ArrayList<Tyokalu>();
	
	public void teroita() {
		for (Tyokalu tyokalu : this.tyokalut) {
			if (tyokalu.teroitettava) {
				tyokalu.terä = 0;
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
	
	public void lisääTyökalu(Tyokalu työkalu) {
		this.tyokalut.add(työkalu);
	}
}