package tehtava2;

import java.util.ArrayList;

class Henkil� {
	
	private ArrayList<Kirja> lainaukset;

	public Henkil�() {
		lainaukset = new ArrayList<Kirja>();
	}
	
	public void lainaa(Kirja kirja) {
		try {
			if (lainaukset.contains(kirja)){
				throw new LainausVirhe();
			}else if (kirja.onLainattu) {
				throw new OnlainattuVirhe();
			}else {
				lainaukset.add(kirja);
				kirja.onLainattu = true;
			}
		} catch (OnlainattuVirhe o) {
			System.out.println("Kirja on lainattu.");
		}catch (LainausVirhe p) {
			System.out.println("Olet jo lainannut.");
		}
		
	}
	
	public void palauta(Kirja kirja) {
		try {
			if (!lainaukset.contains(kirja)) {
				throw new PalautusVirhe();
			}else {
				lainaukset.remove(kirja);
				kirja.onLainattu = false;
			}
			
		}catch (PalautusVirhe p) {
			System.out.println("Et ole lainnanut t�t� kirjaa.");
			}
		
	}
	
	
}
	
	
		
