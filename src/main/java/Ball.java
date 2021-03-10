public class Ball extends Shapes{

    private final double width;
    private final double height;

    public Ball(double x, double y, double width, double height, double speed) {
        super(x, y, speed);
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return (float) width;
    }

    public float getHeight() {
        return (float) height;
    }

}
