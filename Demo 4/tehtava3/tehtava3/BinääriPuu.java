package tehtava3;

class Bin��riPuu{
	Alkio juuri;

	
	public Alkio lis��Puuhun(Alkio nykyinen, int luku) {
	    if (nykyinen == null) {
	        return new Alkio(luku);
	    }
	    if (luku < nykyinen.luku) {
	    	nykyinen.vasen = lis��Puuhun(nykyinen.vasen, luku);
	    } else if (luku > nykyinen.luku) {
	    	nykyinen.oikea = lis��Puuhun(nykyinen.oikea, luku);
	    } else {
	        return nykyinen;
	    }

	    return nykyinen;
	}
	
	public void lis��(int a) {
	    juuri = lis��Puuhun(juuri, a);
	}
	
	/*
	public boolean onkoPuussa(Alkio nykyinen, int a) {
		if (nykyinenluku == a) {
			return true;
		}
		if(nykyinen.vasen == null && nykyinen.oikea == null){
			return false;
		}else if(nykyinen.vasen == null){
			return onkoPuussa(nykyinen.oikea, a);
		}else if(nykyinen.oikea == null){
			return onkoPuussa(nykyinen.vasen, a);
		} else{
			return onkoPuussa(nykyinen.vasen, a) || onkoPuussa(nykyinen.oikea, a);
		}
	}
	*/
	
	private boolean onkoAlkio(Alkio nykyinen, int luku) {
	    if (nykyinen == null) {
	        return false;
	    } 
	    if (luku == nykyinen.luku) {
	        return true;
	    } 
	    if (luku < nykyinen.luku) {
	    	return onkoAlkio(nykyinen.vasen, luku);
	    } else {
	    	return onkoAlkio(nykyinen.oikea, luku);
	    }
	}
	    
	    /*
	    return luku < nykyinen.luku
	      ? onkoAlkio(nykyinen.vasen, luku)
	      : onkoAlkio(nykyinen.oikea, luku);
	}
	*/
	
	public boolean onkoLuku(int luku) {
	    return onkoAlkio(juuri, luku);
	}
}