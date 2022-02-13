package tehtava3;
import java.util.ArrayList;

class Varasto {
	private ArrayList<Tuote> tuotteet ;

	public Varasto() {
		this.tuotteet = new ArrayList<Tuote>();
	}

	public ArrayList<Tuote> getTuotteet() {
		return tuotteet;
	}

	//huom. setTuotteet() metodia ei tarvita
	
	
}