import java.util.ArrayList;

class Piste implements Kappale{
    ArrayList<Integer> sijainti;

    public Piste(ArrayList<Integer> sijainti) {
        this.sijainti = sijainti;
    }

    @Override
    public ArrayList<Integer> annaKeskipiste() {
        return sijainti;
    }

    @Override
    public double annaAla() {
        return 0.0;
    }
}
