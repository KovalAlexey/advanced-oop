public abstract class Figure {
    public String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract void drawFigure();

    public abstract double toSquare();
}

