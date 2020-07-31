public abstract class Figure {
    public Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract void drawFigure();

    public abstract double toSquare();
}

