package aufgabe01d;

import utils.InputHelper;

import java.util.Arrays;


public class Bibliothek {
    Book[] bookList;

    public Bibliothek() {
        this.bookList = new Book[1];
    }

    public Book[] getBookList() {
        return bookList;
    }

    public void startBibliothek() {
        while (true) {
            String choose =
                    "Choose option:\n"
                            + "1 display a list of books\n"
                            + "2 Add Book\n"
                            + "3 Find Book\n"
                            + "0 exit\n";

            switch (InputHelper.readString(choose)) {
                case "1":
                    printBookList();
                    break;
                case "2":
                    addBook(Book.getBookFromUserInput(), bookList);
                    break;
                case "3":
                    System.out.println(
                            findBookByTitle(InputHelper.readString("Input Title")));
                    break;
                case "0":
                    System.exit(0);
            }
        }
    }

    public void printBookList() {
        System.out.println(bookList.length);
        for (Book book : bookList)
            System.out.println(book);
    }

    public void addBook(Book book, Book[] books) {

        int emptySpace = findEmptySpace(books);
        if (emptySpace == -1) {
            emptySpace = books.length;
            books = Arrays.copyOf(books, books.length + 1);
        }

        books[emptySpace] = book;
    }

    public Book[] findBookByTitle(String request) {
        Bibliothek foundBooks = new Bibliothek();

        for (Book book : bookList) {
            if (book.getTitle().equals(request))
                foundBooks.addBook(book,bookList);
        }
        return foundBooks.bookList;
    }

    int findEmptySpace(Book[] books) {
        int emptySpace;

        for (emptySpace = 0; emptySpace < books.length; emptySpace++) {
            if (books[emptySpace] == null)
                return emptySpace;
        }
        return -1;
    }
}

