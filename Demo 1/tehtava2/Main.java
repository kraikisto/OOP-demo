package tehtava2;

public class Main {

	public static void main(String[] args) {
		
		Paivakirja pk = new Paivakirja("salasana123");
		
		pk.kirjoita("moi");
		pk.kirjoita("hei");
		System.out.println(pk.lueKirja());
		
	}
}
