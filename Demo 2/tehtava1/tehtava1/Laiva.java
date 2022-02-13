package tehtava1;
class Laiva{
    String nimi;
    Integer pituus;
    Integer syv‰ys;
    Integer nopeus;
    

    public Laiva (String nimi, Integer pituus, Integer syv‰ys, Integer nopeus) {
        this.nimi = nimi;
        this.pituus = pituus;
        this.syv‰ys = syv‰ys;
        this.nopeus = nopeus;
    }

    public int matkaAika(int matka) {  //matka pit‰‰ antaa merimaileissa jotta vastaus on oikea
        int aika = matka / nopeus;
        return aika;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public Integer getPituus() {
        return pituus;
    }

    public void setPituus(Integer pituus) {
        this.pituus = pituus;
    }

    public Integer getSyv‰ys() {
        return syv‰ys;
    }

    public void setSyv‰ys(Integer syv‰ys) {
        this.syv‰ys = syv‰ys;
    }

    public Integer getNopeus() {
        return nopeus;
    }

    public void setNopeus(Integer nopeus) {
        this.nopeus = nopeus;
    }
    
}