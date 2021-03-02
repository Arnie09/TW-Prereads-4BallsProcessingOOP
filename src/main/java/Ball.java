public class Ball {

    private final double width;
    private final double height;
    private final double y;
    private double x;

    public Ball(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void increment_x_position(double delta) {
        this.x += delta;
    }

    public float getWidth() {
        return (float) width;
    }

    public float getHeight() {
        return (float) height;
    }

    public float getY() {
        return (float) y;
    }

    public float getX() {
        return (float) x;
    }
}
