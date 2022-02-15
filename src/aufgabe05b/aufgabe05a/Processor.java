package aufgabe05b.aufgabe05a;

import aufgabe05a.PositionMwSt118;

class Processor extends PositionMwSt118 {
    int geschwindigkeit;

    public int getGeschwindigkeit() {        return geschwindigkeit;    }
    public void setGeschwindigkeit(int geschwindigkeit) {        this.geschwindigkeit = geschwindigkeit;    }

    public Processor(String name, int amount, float price) {
        super(name, amount, price);
    }

    public static Processor getInstance(){
        return new Processor("Prozessor", 1, 100);
    }

}
