public class Main {
    public static void main(String[] args) {
        getRandomFigure();
    }

    private static void getRandomFigure() {
        Figure[] figures = new Figure[1 + (int) (Math.random() * 15)];

        for (int i = 0; i < figures.length; i++) {
            switch ((int) (Math.random() * 4)) {
                case 1 -> figures[i] = new Square(colorGenerator(), numberGenerator());
                case 2 -> figures[i] = new Triangle(colorGenerator(), numberGenerator());
                case 3 -> figures[i] = new Circle(colorGenerator(), numberGenerator());
                default -> figures[i] = new Trapezoid(colorGenerator(), numberGenerator(), numberGenerator());
            }
        }
        for (Figure figure : figures){
            figure.drawFigure();
        }
    }

    private static double numberGenerator() {
        return Math.random() * 10;
    }

    public static Color colorGenerator() {
        return switch ((int) (Math.random() * 5)) {
            case 1 -> Color.BLUE;
            case 2 -> Color.GREEN;
            case 3 -> Color.RED;
            case 4 -> Color.YELLOW;
            default -> Color.WHITE;
        };
    }
}
