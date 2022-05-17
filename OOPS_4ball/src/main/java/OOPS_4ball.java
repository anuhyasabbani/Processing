import processing.core.PApplet;

public class OOPS_4ball extends PApplet {

    public static final int DIAMETER = 20;
    private final int WIDTH = 1500;
    private final int HEIGHT = 1000;
    int POSITION=0;

    Ball ball = new Ball(DIAMETER);
    Draw draw = new Draw(this,WIDTH, HEIGHT, POSITION, ball);

    public static void main(String[] args) {
        PApplet.main("OOPS_4ball", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    public void draw(){
        draw.drawCircle();
    }

}
