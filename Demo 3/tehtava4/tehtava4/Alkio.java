package tehtava4;

class Alkio {
	private int luku;
	private Alkio vasen; //vasen ja oikea ovat lapset
	private Alkio oikea;
	
	public Alkio(int luku) {
		this.luku = luku;
		this.vasen = null;
		this.oikea = null;
	}


	public int tarkistaPuu(){ //tarkistaa alkioiden määrän puussa
		if(vasen == null && oikea == null){
			return 1;
		}else if(vasen == null){
			return 1 + oikea.tarkistaPuu();
		}else if(oikea == null){
			return 1 + vasen.tarkistaPuu();
		} else{
			return 1 + vasen.tarkistaPuu() + oikea.tarkistaPuu();
		}
	}
	
	
	public void lisääPuuhun(int a){ //voi valita mihin kohtaa laittaa, jos laittaa juureen, se lisää automaattisesti seuraavaan mistä puuttuu
	    Alkio bt = new Alkio(a);
		if(vasen == null){
	        vasen = bt;
	    }else if(oikea == null){
	        oikea = bt;
	    }else{
	        if(vasen.tarkistaPuu() <= oikea.tarkistaPuu()){
	            vasen.lisääPuuhun(a);
	        }else{
	            oikea.lisääPuuhun(a);
	        }
	    }
	}
	
	
	public boolean onkoPuussa(int a) {
		boolean onkoTosi = false;
		if (luku == a) {
			onkoTosi = true;
		}
		if(vasen == null && oikea == null){
			return onkoTosi;
		}else if(vasen == null){
			return oikea.onkoPuussa(a);
		}else if(oikea == null){
			return vasen.onkoPuussa(a);
		} else{
			return vasen.onkoPuussa(a) || oikea.onkoPuussa(a);
		}
	}
}