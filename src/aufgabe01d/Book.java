package aufgabe01d;

import utils.InputHelper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

public class Buch {
    private final String titel;
    private final Isbn isbn;
    private final Date datum;
    private final String author;
    private final int anzahlSeiten;

    private Buch(String titel, String isbn, Date datum, String author, int anzahlSeiten) {
        this.titel = titel;
        this.isbn = new Isbn(isbn);
        this.datum = datum;
        this.author = author;
        this.anzahlSeiten = anzahlSeiten;
    }

    public static Buch getInstance() {
        Buch buch = new Buch(
                InputHelper.readString("Input titel"),
                InputHelper.readString("Input isbn"),
                new Date(System.currentTimeMillis()),
                InputHelper.readString("Input autor"),
                InputHelper.readInt("Input number of pages")
        );
        return buch;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + titel + '\'' +
                ", isbn=" + isbn +
                ", datum=" + datum +
                ", author='" + author + '\'' +
                ", anzahlSeiten=" + anzahlSeiten +
                '}';
    }

    private class Isbn {
        private final String isbn;

        public Isbn(String isbn) {
            this.isbn = isbn;
        }

        @Override
        public String toString() {
            return isbn;
        }
    }
}
