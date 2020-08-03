public class Square extends Figure {
    private double squareSide;

    public Square(Color color, double sideLength) {
        super(color);
        this.squareSide = sideLength;
    }

    @Override
    public double toSquare() {
        return Math.pow(squareSide, 2);
    }

    public double getDiagonal(){
        return Math.sqrt(2) * squareSide;
    }

    @Override
    public void drawFigure() {
        System.out.println("This is square, color: " + this.color + ", square: "
                + toSquare() + " sq.units, with diagonal: " + getDiagonal() + " units");
    }
}
