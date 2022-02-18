package aufgabe05d;

public abstract class Prisma implements Form{
    private double length;
    abstract double getBaseArea();
    abstract double getBasePerimetr();

    public Prisma(double length) {
        this.length = length;
    }

    @Override
    public double getSurfaceArea() {
        return 2*getBaseArea() + getBasePerimetr() * length;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * length;
    }
}
