package aufgabe05b.aufgabe05a;

import aufgabe05a.PositionMwSt118;

class Festplatte extends PositionMwSt118 {
    int size;

    public int getSize() {
        return size;
    }
    public void setSize(int size) {        this.size = size;    }

    public Festplatte(String name, int amount, float price) {
        super(name, amount, price);
    }

    public static Festplatte getInstance(){
        return new Festplatte("HDD", 1, 50);
    }

}
