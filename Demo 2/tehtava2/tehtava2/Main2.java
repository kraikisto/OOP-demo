package tehtava2;

public class Main2 {
    public static void main(String[] args) {
        Pelaaja p1 = new Pelaaja(10, "Jari Litmakainen", "Kenttäpelaaja");
        Pelaaja p2 = new Pelaaja(11, "Sakari Koivunen", "Maalivahti");
        Joukkue j = new Joukkue("TyPS", "Areena");
        j.lisaaPelaaja(p1);
        j.lisaaPelaaja(p2);
        System.out.println(p1);
        System.out.println(j);
    }

    
}
