package tehtava1;

public class Main1{
    public static void main(String[] args) {
        Autolaiva titanic = new Autolaiva(1000, 50, 60, "Titanic", 269, 11, 21);
        System.out.println(titanic);
        Rahtilaiva SantaMaria = new Rahtilaiva(1000, 50, "Santa Maria", 200, 7, 15); //en jaksanut selvittää 
        SantaMaria.setRahti(70);
        System.out.print(SantaMaria.getNopeus());
    }
}