package aufgabe03c;

import aufgabe03c.types.ANTRIB;
import aufgabe03c.types.FUEL;
import aufgabe03c.types.Farbe;
import aufgabe03c.types.GETRIBE;

public class TestAuto {
    public static void main(String[] args) {
        Auto auto1 = new Auto(Farbe.BLACK, GETRIBE.AUTOMATIC, ANTRIB.ALLROAD, FUEL.BENZINE, 4, 2000 );
        auto1.printInfo();
    }
}
