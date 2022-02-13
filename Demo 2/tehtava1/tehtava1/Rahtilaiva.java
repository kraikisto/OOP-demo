package tehtava1;

class Rahtilaiva extends Laiva {
    private double kapasiteetti;
    private double rahti;

	public Rahtilaiva(double kapasiteetti, double rahti,String nimi, Integer pituus, Integer syväys, Integer nopeus) {
		super(nimi, pituus, syväys, nopeus);
        this.kapasiteetti = kapasiteetti;
		this.rahti = rahti;
	}
    public double getKapasiteetti(){
        return kapasiteetti;
    }
    public double getRahti(){
        return rahti;
    }
    public void setKapasiteetti(double kapasiteetti){
        this.kapasiteetti = kapasiteetti;
    }
    public void setRahti(double rahti) {
        if (rahti < kapasiteetti) {
            this.rahti = rahti;
            this.nopeus = (int) (((kapasiteetti - Math.round(rahti)) / kapasiteetti) * this.nopeus);
        } else {
            System.out.println("Liian suuri rahti!");
        }
        
    }
    
    
}
