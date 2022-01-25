package aufgabe01d;

import utils.InputHelper;

import java.util.ArrayList;
import java.util.Arrays;

public class Bibliothek {
    private static int numberOfBooks = 0;
    private static Buch[] bibliothek = new Buch[100];



    public static void addBook(Buch buch){
        bibliothek[numberOfBooks] = buch;
        System.out.println("Book added");
        numberOfBooks++;
    }

    public static String printBooksArray(){
        System.out.println(bibliothek[0]);
        return Arrays.deepToString(bibliothek);
    }

    public static void startBibliothek(){
        while (true){
            int choose = InputHelper.readInt("Choose option:\n"
                    + "1 Add Book\n"
                    + "2 display a list of books\n"
                    + "0 exit\n");
            switch(choose){
                case 1:
                    Bibliothek.addBook(Buch.getInstance());
                    break;
                case 2:
                    Bibliothek.printBooksArray();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

}
