package aufgabe05d;

public class Quader extends Prisma{
    double width;
    double height;

    public Quader(double width, double height, double length) {
        super(length);
        this.width = width;
        this.height = height;
    }

    @Override
    double getBaseArea() {
        return width * height;
    }

    @Override
    double getBasePerimetr() {
        return 2 * (width + height);
    }
}
