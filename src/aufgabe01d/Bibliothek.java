package aufgabe01d;

import utils.InputHelper;

import java.util.Arrays;


public class Bibliothek {

    private static Book[] bookList = new Book[1];

    public static void startBibliothek() {
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
                    addBook(Book.getBookFromUserInput());
                    break;
                case "3":
                    findBookByTitle(InputHelper.readString("Input Title"));
                    break;
                case "0":
                    System.exit(0);
            }
        }
    }

    public static void printBookList() {
        for (Book book : bookList)
            System.out.println(book);
    }

    public static void addBook(Book book) {
        int emptySpace = BiblioUtils.findEmptySpace(null);
        bookList[emptySpace] = book;
    }

    public static Book findBookByTitle(String request) {
        for (Book book : bookList) {
            if (book.getTitle().equals(request))
                return book;
        }
        return null;
    }

    static class BiblioUtils {


        static int findEmptySpace(String place) {
            int emptySpace;

            for (emptySpace = 0; emptySpace < bookList.length; emptySpace++) {
                if (bookList[emptySpace] == null)
                    return emptySpace;
            }
            bookList = Arrays.copyOf(bookList, bookList.length + 1);
            return emptySpace++;
        }
    }

}
