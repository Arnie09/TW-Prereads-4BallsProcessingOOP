import processing.core.PApplet;

public class FourBallsOOPs extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 720;
    
    public final double ball_width = 10;
    public final double ball_height = 10;
    public final double balls_initial_x_position = 0;
    
    public final double ball1_y_position = HEIGHT / 5.0;
    public final double ball2_y_position = 2 * HEIGHT / 5.0;
    public final double ball3_y_position = 3 * HEIGHT / 5.0;
    public final double ball4_y_position = 4 * HEIGHT / 5.0;
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;


    public static void main(String[] args) {
        PApplet.main("FourBallsOOPs", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        ball1 = new Ball(balls_initial_x_position, ball1_y_position, ball_width, ball_height);
        ball2 = new Ball(balls_initial_x_position, ball2_y_position, ball_width, ball_height);
        ball3 = new Ball(balls_initial_x_position, ball3_y_position, ball_width, ball_height);
        ball4 = new Ball(balls_initial_x_position, ball4_y_position, ball_width, ball_height);
    }

    @Override
    public void draw() {
        drawCircles();
        updateCircles();
    }

    private void updateCircles() {
        ball1.increment_x_position(1);
        ball2.increment_x_position(2);
        ball3.increment_x_position(3);
        ball4.increment_x_position(4);
    }

    private void drawCircles() {
        ellipse(ball1.getX(), ball1.getY(), ball1.getHeight(), ball1.getWidth());
        ellipse(ball2.getX(), ball2.getY(), ball2.getHeight(), ball2.getWidth());
        ellipse(ball3.getX(), ball3.getY(), ball3.getHeight(), ball3.getWidth());
        ellipse(ball4.getX(), ball4.getY(), ball4.getHeight(), ball4.getWidth());
    }
}
