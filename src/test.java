import aufgabe01d.Start;

public class test {
    enum Size {S, L, XL}

    public static void main(String[] args) {
        extracted(Size.S);
    }

    public static void extracted(Size S) {
        switch (Size.S) {
            case S:
                System.out.println("S");
            case L:
                System.out.println("L");
        }
    }
}
