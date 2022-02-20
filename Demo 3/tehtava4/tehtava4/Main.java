package tehtava4;

class Main {
	public static void main(String[] args) {
		Alkio juuri = new Alkio(1);
		
		juuri.lisääPuuhun(2);
		juuri.lisääPuuhun(3);
		juuri.lisääPuuhun(4);
		juuri.lisääPuuhun(5);
		juuri.lisääPuuhun(6);
		
		System.out.println(juuri.onkoPuussa(8));
		System.out.println(juuri.onkoPuussa(10));
	}
}

