package aufgabe01d;

import java.util.Date;

public class Buch {
    String titel;
    Isbn isbn;
    Date datum;
    String author;
    int anzahlSeiten;

    private class Isbn {
        String isbn;

        @Override
        public String toString() {
            return isbn;
        }
    }
}
