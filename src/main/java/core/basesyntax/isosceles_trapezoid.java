package core.basesyntax;

public class isosceles_trapezoid extends Figural {
    private int firstBase;
    private int secondBase;
    private int height;

    public isosceles_trapezoid (String color, int firstBase, int secondBase, int height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right_triangle, area: "
                + getArea()
                + " sq. units, firstBase: "
                + firstBase
                + " units, secondBase :"
                + secondBase
                + " units, height :"
                + height
                + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / 2 * height;
    }
}