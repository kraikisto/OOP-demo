package tehtava4;

class Main {
	public static void main(String[] args) {
		Alkio juuri = new Alkio(1);
		
		juuri.lis��Puuhun(2);
		juuri.lis��Puuhun(3);
		juuri.lis��Puuhun(4);
		juuri.lis��Puuhun(5);
		juuri.lis��Puuhun(6);
		
		System.out.println(juuri.onkoPuussa(8));
		System.out.println(juuri.onkoPuussa(10));
	}
}

