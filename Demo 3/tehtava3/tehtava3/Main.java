package tehtava3;

public class Main {
	public static void main(String[] args) {
		Hiomakone tk1 = new Hiomakone();
		tk1.k�yt�();
		System.out.println(tk1.getAkku());
		Tyokalupakki pakki = new Tyokalupakki();
		pakki.lis��Ty�kalu(tk1);
		pakki.lataa();
		System.out.println(tk1.getAkku());
		
		Saha tk2 = new Saha();
		pakki.lis��Ty�kalu(tk2);
		Vasara tk3 = new Vasara();
		pakki.lis��Ty�kalu(tk3);
		Kirves tk4 = new Kirves();
		pakki.lis��Ty�kalu(tk4);
		Puukko tk5 = new Puukko();
		pakki.lis��Ty�kalu(tk5);
	}
}