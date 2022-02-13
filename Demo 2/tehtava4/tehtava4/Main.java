package tehtava4;

public class Main {
	
	public static void main(String[] args) {
		
		LinkitettyLista lista = new LinkitettyLista();
		
		lista.lisaaAlkio(1);
		lista.lisaaAlkio(2);
		lista.lisaaAlkio(3);
		lista.lisaaAlkio(4);
		lista.lisaaAlkio(5);
		
		lista.lueAlustaLoppuun();
		
		lista.lueLopustaAlkuun();
		
		
		lista.haeAlkio(4);
		lista.haeAlkio(6);
		
		lista.poistaAlkio(4);
		lista.poistaAlkio(2);
		lista.poistaAlkio(5);
		lista.poistaAlkio(5);
		
		lista.lueAlustaLoppuun();
		
		lista.lueLopustaAlkuun();
		
	}

}
