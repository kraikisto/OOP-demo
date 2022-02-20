import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> kplist = new ArrayList<>();
        kplist.add(1);
        kplist.add(2);
        kplist.add(3);
        ArrayList<Integer> plist = new ArrayList<>();
        plist.add(2);
        plist.add(3);
        plist.add(4);
        Piste kp = new Piste(kplist);
        Piste p = new Piste(plist);
        Kuutio kpl = new Kuutio(kp,p);
        System.out.println(kpl.annaAla());
    }
}
