package tehtava3;
public class Main{
	
	public static void main(String[] args) {
		Tuote t1 = new Tuote(1234, 10, "Omena", "Hedelm‰t");
		Tuote t2 = new Tuote(1235, 5, "Banaani", "Hedelm‰t");
		
		Tyˆntekij‰ tt = new Tyˆntekij‰(11, "Henri", "Myyj‰");
		
		Varasto varasto1 = new Varasto();
		
		tt.lis‰‰Varastoon(t1, varasto1);
		tt.lis‰‰Varastoon(t2, varasto1);
		System.out.println(varasto1.getTuotteet());
		tt.poistaVarastosta(t2, varasto1);
		System.out.println(varasto1.getTuotteet());
		
		Asiakas as = new Asiakas(123, "Leevi", "Vesilinnantie 5");
		
		as.lis‰‰Ostoskoriin(t1);
		as.lis‰‰Ostoskoriin(t1);
		as.lis‰‰Ostoskoriin(t1);
		as.lis‰‰Ostoskoriin(t2);
		System.out.println(as.getOstoskori());
		as.poistaOstoskorista(t1);
		System.out.println(as.getOstoskori());
		
		
		System.out.println(as.yhteisHinta());
		as.teeMaksu();
		
	}
}