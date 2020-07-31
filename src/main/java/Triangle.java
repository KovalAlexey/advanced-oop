public class Triangle extends Figure {
    private double triangleSide;

    public Triangle(Color color, double triangleSide) {
        super(color);
        this.triangleSide = triangleSide;
    }

    @Override
    public double toSquare() {
        return (Math.pow(triangleSide, 2) * Math.sqrt(3))/4;
    }

        public int getHeight() {
        return (int) (triangleSide * Math.sqrt(3))/2;
    }

    @Override
    public void drawFigure() {
        System.out.println("This is triangle, color: " + this.color + ", square: "
                + toSquare() + " sq.units, with heigth: " + getHeight() + " units");
    }
}
