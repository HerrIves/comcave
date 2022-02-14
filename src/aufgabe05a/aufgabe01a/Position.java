package aufgabe05a.aufgabe01a;

public class Position {
    private String name;
    private int amount;
    private float price;
    private float mwSt;

    public Position(String name, int amount, float price, float mwSt) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.mwSt = mwSt;
    }

    public float getMwSt() {        return mwSt;    }
    public void setMwSt(float mwSt) {        this.mwSt = mwSt;    }

    public float getPrice() {        return price;    }
    public void setPrice(float price) {        this.price = price;    }

    public int getAmount() {        return amount;    }
    public void setAmount(int amount) {        this.amount = amount;    }
}
