public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double toSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getLength(){
        return 2 * Math.PI * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("This is circle, color: " + this.color + ", square: "
                + toSquare() + " sq.units, with circle length: " + getLength() + " units");
    }
}
