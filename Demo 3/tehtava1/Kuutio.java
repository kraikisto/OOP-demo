import java.util.ArrayList;

class Kuutio implements Kappale{
    Piste keskipiste;
    Piste kulma; //n�ill� tiedoilla oikeastaan saa laskettua mit� vain

    public Kuutio(Piste keskipiste, Piste kulma) {
        this.keskipiste = keskipiste;
        this.kulma = kulma;
    }
    @Override
    public ArrayList<Integer> annaKeskipiste() {
        return keskipiste.annaKeskipiste();
    }
    @Override
    public double annaAla(){
        return 6*Math.pow(2*Math.pow(Math.cos(Math.PI/4),2)*Math.sqrt(Math.pow(kulma.annaKeskipiste().get(0)-keskipiste.annaKeskipiste().get(0),2) 
        		+ Math.pow(kulma.annaKeskipiste().get(1)-keskipiste.annaKeskipiste().get(1),2) + Math.pow(kulma.annaKeskipiste().get(2)-keskipiste.annaKeskipiste().get(2),2)),2);
    } //ei ehk� koodin kannalta selkein, mutta t�ll� tavalla sen voi laskea kulmalla ja keskipisteell�.
    
}
//jos atribuuteiksi ottaa sivun pituuden se on 6*Math.pow(pituus,2)