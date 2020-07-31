public class Trapezoid extends Figure {
    private double trapezoidMiddle;
    private double trapezoidHeigth;

    public Trapezoid(Color color, double trapezoidMiddle, double trapezoidHeigth) {
        super(color);
        this.trapezoidMiddle = trapezoidMiddle;
        this.trapezoidHeigth = trapezoidHeigth;
    }

    @Override
    public double toSquare() {
        return trapezoidHeigth * trapezoidMiddle;
    }

    public double getDiagonal(){
        return Math.sqrt(Math.pow(trapezoidHeigth,2) * Math.pow(trapezoidMiddle, 2));
    }

    @Override
    public void drawFigure() {
        System.out.println("This is trapezoid, color: " + this.color + ", square: "
                + toSquare() + " sq.units, with diagonal: " + getDiagonal() + " units");
    }
}
