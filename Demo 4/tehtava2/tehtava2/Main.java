package tehtava2;



public class Main {
	
	public static void main(String[] args) {
		Kirja k1 = new Kirja(123);
		Kirja k2 = new Kirja(124);
		Kirja k3 = new Kirja(125);
		Henkilö h1 = new Henkilö();
		Henkilö h2 = new Henkilö();
		h1.palauta(k1);
		h1.lainaa(k2);
		h1.lainaa(k3);
		h1.lainaa(k2);
		h2.lainaa(k3);
		
	}
}