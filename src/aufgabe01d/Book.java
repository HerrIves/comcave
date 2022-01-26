package aufgabe01d;

import utils.InputHelper;
import java.time.LocalDate;

public class Book {
    private final String title;

    private final Isbn isbn;
    private final LocalDate datum;
    private final String author;
    private final int anzahlSeiten;

    private Book(String titel, String isbn, LocalDate datum, String author, int anzahlSeiten) {
        this.title = titel;
        this.isbn = new Isbn(isbn);
        this.datum = datum;
        this.author = author;
        this.anzahlSeiten = anzahlSeiten;
    }

    public String getTitle() { return title; }

    public static Book getBookFromUserInput() {

        String titel = InputHelper.readString("Input titel");
        String isbn = InputHelper.readString("Input isbn");
        LocalDate date = InputHelper.readDate("Input date yyyyMMdd where y -year, M -month, d -day zB 20201121");
        String author = InputHelper.readString("Input author");
        int numberOfPages = InputHelper.readInt("Input number of pages");

        return new Book(titel, isbn, date, author, numberOfPages);
    }

    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + title + '\'' +
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
