package tehtava3;

public class Main {
	public static void main(String[] args) {
		Hiomakone tk1 = new Hiomakone();
		tk1.käytä();
		System.out.println(tk1.getAkku());
		Tyokalupakki pakki = new Tyokalupakki();
		pakki.lisääTyökalu(tk1);
		pakki.lataa();
		System.out.println(tk1.getAkku());
		
		Saha tk2 = new Saha();
		pakki.lisääTyökalu(tk2);
		Vasara tk3 = new Vasara();
		pakki.lisääTyökalu(tk3);
		Kirves tk4 = new Kirves();
		pakki.lisääTyökalu(tk4);
		Puukko tk5 = new Puukko();
		pakki.lisääTyökalu(tk5);
	}
}