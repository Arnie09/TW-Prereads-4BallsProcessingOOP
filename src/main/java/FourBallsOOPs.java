import processing.core.PApplet;

public class FourBallsOOPs extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 720;

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
        double ball_width = 10;
        double ball_height = 10;
        double balls_initial_x_position = 0;

        double ball1_y_position = HEIGHT / 5.0;
        double ball2_y_position = 2 * HEIGHT / 5.0;
        double ball3_y_position = 3 * HEIGHT / 5.0;
        double ball4_y_position = 4 * HEIGHT / 5.0;

        ball1 = new Ball(balls_initial_x_position, ball1_y_position, ball_width, ball_height, 1);
        ball2 = new Ball(balls_initial_x_position, ball2_y_position, ball_width, ball_height, 2);
        ball3 = new Ball(balls_initial_x_position, ball3_y_position, ball_width, ball_height, 3);
        ball4 = new Ball(balls_initial_x_position, ball4_y_position, ball_width, ball_height, 4);
    }

    @Override
    public void draw() {
        drawCircles();
        updateCircles();
    }

    private void updateCircles() {
        ball1.move_x();
        ball2.move_x();
        ball3.move_x();
        ball4.move_x();
    }

    private void drawCircles() {
        ellipse((float)ball1.get_x_position(), (float)ball1.get_y_position(), ball1.getHeight(), ball1.getWidth());
        ellipse((float)ball2.get_x_position(), (float)ball2.get_y_position(), ball2.getHeight(), ball2.getWidth());
        ellipse((float)ball3.get_x_position(), (float)ball3.get_y_position(), ball3.getHeight(), ball3.getWidth());
        ellipse((float)ball4.get_x_position(), (float)ball4.get_y_position(), ball4.getHeight(), ball4.getWidth());
    }
}
