public class Main {
    public static void main(String[] args) {

        Figure[] figures = new Figure[1 + (int) (Math.random() * 15)];

        for(int i = 0; i < figures.length; i++){
            switch ((int)(Math.random() * 4)){
                case 1:
                    figures[i] = new Square(colorGenerator(),numberGenerator());
                    break;
                case 2:
                    figures[i] = new Triangle(colorGenerator(), numberGenerator());
                    break;
                case 3:
                    figures[i] = new Circle(colorGenerator(), numberGenerator());
                    break;
                default:
                    figures[i] = new Trapezoid(colorGenerator(), numberGenerator(), numberGenerator());
            }
        }

        for (Figure figure : figures){
            figure.drawFigure();
        }
    }

    public static double numberGenerator() {
        return Math.random() * 10;
    }

    public static String colorGenerator() {
        switch ((int) (Math.random() * 5)) {
            case 1:
                return "Blue";
            case 2:
                return "Black";
            case 3:
                return "White";
            case 4:
                return "Yellow";
            default:
                return "Green";

        }
    }
}
