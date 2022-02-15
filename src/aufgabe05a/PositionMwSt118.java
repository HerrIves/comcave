package aufgabe05a;

public class PositionMwSt118 extends AbstractPosition{
    private static final float mwSt = 1.18f;

    @Override
    public float getMwSt() {
        return mwSt;
    }

    public PositionMwSt118(String name, int amount, float price) {
        super(name, amount, price, mwSt);
    }
}
