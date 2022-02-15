package aufgabe05b.aufgabe05a;

import aufgabe05a.PositionMwSt118;

class RAM extends PositionMwSt118 {
    int size;

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public RAM(String name, int amount, float price) {
        super(name, amount, price);
    }

    public static RAM getInstance(){
        return new RAM("RAM", 1, 100);
    }
}
