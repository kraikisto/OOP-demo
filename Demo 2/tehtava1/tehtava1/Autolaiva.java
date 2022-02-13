package tehtava1;
class Autolaiva extends Laiva{
    private final int kapasiteetti;
    private int matkustajam‰‰r‰;
    private int ajoneuvojenm‰‰r‰;

    public Autolaiva(int kapasiteetti, int matkustajam‰‰r‰, int ajoneuvojenm‰‰r‰, String nimi, Integer pituus, Integer syv‰ys, Integer nopeus) {
        super(nimi, pituus, syv‰ys, nopeus);
        this.kapasiteetti = kapasiteetti;
        this.matkustajam‰‰r‰ = matkustajam‰‰r‰;
        this.ajoneuvojenm‰‰r‰ = ajoneuvojenm‰‰r‰;
    }

    public int getKapasiteetti() {
        return kapasiteetti;
    }

    public int getMatkustajam‰‰r‰() {
        return matkustajam‰‰r‰;
    }

    public void setMatkustajam‰‰r‰(int matkustajam‰‰r‰) {
        if (kapasiteetti > matkustajam‰‰r‰ + ajoneuvojenm‰‰r‰*10) {
            this.matkustajam‰‰r‰ = matkustajam‰‰r‰;
        } else {
            System.out.println("Kapasiteetti ylittyy!");
        }
    }

    public int getAjoneuvojenm‰‰r‰() {
        return ajoneuvojenm‰‰r‰;
    }

    public void setAjoneuvojenm‰‰r‰(int ajoneuvojenm‰‰r‰) {
        if (kapasiteetti > matkustajam‰‰r‰ + ajoneuvojenm‰‰r‰*10) {
            this.ajoneuvojenm‰‰r‰ = ajoneuvojenm‰‰r‰;
        } else {
            System.out.println("Kapasiteetti ylittyy!");
        }
    }
    
    
}
