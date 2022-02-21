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
    double getBasePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void printInfo() {
        System.out.println("height: " + height);
        System.out.println("width: " + width);
        super.printInfo();




    }
}
