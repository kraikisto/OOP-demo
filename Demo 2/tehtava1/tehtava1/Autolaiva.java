package tehtava1;
class Autolaiva extends Laiva{
    private final int kapasiteetti;
    private int matkustajamäärä;
    private int ajoneuvojenmäärä;

    public Autolaiva(int kapasiteetti, int matkustajamäärä, int ajoneuvojenmäärä, String nimi, Integer pituus, Integer syväys, Integer nopeus) {
        super(nimi, pituus, syväys, nopeus);
        this.kapasiteetti = kapasiteetti;
        this.matkustajamäärä = matkustajamäärä;
        this.ajoneuvojenmäärä = ajoneuvojenmäärä;
    }

    public int getKapasiteetti() {
        return kapasiteetti;
    }

    public int getMatkustajamäärä() {
        return matkustajamäärä;
    }

    public void setMatkustajamäärä(int matkustajamäärä) {
        if (kapasiteetti > matkustajamäärä + ajoneuvojenmäärä*10) {
            this.matkustajamäärä = matkustajamäärä;
        } else {
            System.out.println("Kapasiteetti ylittyy!");
        }
    }

    public int getAjoneuvojenmäärä() {
        return ajoneuvojenmäärä;
    }

    public void setAjoneuvojenmäärä(int ajoneuvojenmäärä) {
        if (kapasiteetti > matkustajamäärä + ajoneuvojenmäärä*10) {
            this.ajoneuvojenmäärä = ajoneuvojenmäärä;
        } else {
            System.out.println("Kapasiteetti ylittyy!");
        }
    }
    
    
}
