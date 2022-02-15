package aufgabe05a;

public abstract class AbstractPosition {
    private String name;
    private int amount;
    private float price;
    private final float mwSt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float getMwSt();

    public AbstractPosition(String name, int amount, float price, float mwSt) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.mwSt = mwSt;
    }
}
