package tehtava2;
import java.util.ArrayList;

class Joukkue {
    private String nimi;
    private ArrayList<Pelaaja> kentt�pelaajat;
    private ArrayList<Pelaaja> maalivahdit;
    private String kotistadion;
    
    public Joukkue(String nimi, String kotistadion) {
        this.nimi = nimi;
        this.kentt�pelaajat = new ArrayList<>();
        this.maalivahdit = new ArrayList<>();
        this.kotistadion = kotistadion;
    }
    
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public String getNimi() {
        return nimi;
    }
    
    public String getKotistadion() {
        return kotistadion;
    }

    public void setKotistadion(String kotistadion) {
        this.kotistadion = kotistadion;
    }

    

    public void lisaaPelaaja(Pelaaja p) {
        if (p.getPaikka() == "Kentt�pelaaja" & kentt�pelaajat.size() <= 20) {
            kentt�pelaajat.add(p);
        } else if (p.getPaikka() == "Maalivahti" & maalivahdit.size() <= 2) {
            maalivahdit.add(p);
        } else {
            System.out.println("Liikaa pelaajia!");
        }
    }

    @Override
    public String toString() {
        String joukkue = "";
        for (Pelaaja yksittainenPelaaja : kentt�pelaajat) {
            joukkue = joukkue + yksittainenPelaaja.toString() + "; ";

        }
        for (Pelaaja yksittainenPelaaja : maalivahdit) {
            joukkue = joukkue + yksittainenPelaaja.toString() + "; ";
            
        }

        return joukkue;
    }

    
    public boolean equals(Joukkue j) {
        if (this == j){
            return true;
        }
        if (j == null) {
            return false;
        }
        if (Joukkue.class != j.getClass()) {
            return false;
        }

        Joukkue other = (Joukkue) j;
        return nimi.equals(other.nimi);
    }

}