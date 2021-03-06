package tehtava3;
public class Main{
	
	public static void main(String[] args) {
		Tuote t1 = new Tuote(1234, 10, "Omena", "Hedelmät");
		Tuote t2 = new Tuote(1235, 5, "Banaani", "Hedelmät");
		
		Työntekijä tt = new Työntekijä(11, "Henri", "Myyjä");
		
		Varasto varasto1 = new Varasto();
		
		tt.lisääVarastoon(t1, varasto1);
		tt.lisääVarastoon(t2, varasto1);
		System.out.println(varasto1.getTuotteet());
		tt.poistaVarastosta(t2, varasto1);
		System.out.println(varasto1.getTuotteet());
		
		Asiakas as = new Asiakas(123, "Leevi", "Vesilinnantie 5");
		
		as.lisääOstoskoriin(t1);
		as.lisääOstoskoriin(t1);
		as.lisääOstoskoriin(t1);
		as.lisääOstoskoriin(t2);
		System.out.println(as.getOstoskori());
		as.poistaOstoskorista(t1);
		System.out.println(as.getOstoskori());
		
		
		System.out.println(as.yhteisHinta());
		as.teeMaksu();
		
	}
}