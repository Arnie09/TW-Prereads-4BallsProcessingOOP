public class Shapes {
    private double x_position;
    private double y_position;
    private double speed;

    Shapes(double x_position, double y_position, double speed) {
        this.x_position = x_position;
        this.y_position = y_position;
        this.speed = speed;
    }

    public double get_y_position() {
        return y_position;
    }

    public double get_x_position() {
        return x_position;
    }
    
    public void move_x() {
        this.x_position += speed;
    }
    
    public void move_y() {
        this.y_position += speed;
    }

    public double getSpeed() {
        return speed;
    }
    
    public void setSpeed(double new_speed) {
        this.speed = new_speed;
    }
}
