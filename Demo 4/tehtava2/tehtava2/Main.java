package tehtava2;



public class Main {
	
	public static void main(String[] args) {
		Kirja k1 = new Kirja(123);
		Kirja k2 = new Kirja(124);
		Kirja k3 = new Kirja(125);
		Henkil� h1 = new Henkil�();
		Henkil� h2 = new Henkil�();
		h1.palauta(k1);
		h1.lainaa(k2);
		h1.lainaa(k3);
		h1.lainaa(k2);
		h2.lainaa(k3);
		
	}
}