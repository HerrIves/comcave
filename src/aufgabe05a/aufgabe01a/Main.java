package aufgabe05a.aufgabe01a;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static final float mwSt = 1.18f;
    public static void main(String[] args) {
        List positions = new ArrayList<AbstractPosition>();
        Warenkorb myWarenkorb = new Warenkorb(positions);

        myWarenkorb.addPosition(new Position("Midi tower", 1, 20, mwSt));
        myWarenkorb.addPosition(new Position("Netsteil", 1, 30, mwSt));
        myWarenkorb.addPosition(new Position("Motherboard", 1, 30, mwSt));
        myWarenkorb.addPosition(new Position("CPU", 1, 100, mwSt));
        myWarenkorb.addPosition(new Position("Memory", 2, 50, mwSt));
        myWarenkorb.addPosition(new Position("Harddrive", 2, 150, mwSt));

        System.out.println(myWarenkorb.getGesamtPreis());
    }
}
