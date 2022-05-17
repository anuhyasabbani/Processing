import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int DIAMETER = 20;
    private final int WIDTH = 1500;
    private final int HEIGHT = 1000;
    int x=0;

    public static void main(String[] args){
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings(){
        super.settings();
        size(this.WIDTH, this.HEIGHT);
    }


    @Override
    public void draw(){
        for (int speed = 1; speed <= 4; speed++) {
            drawCircle(speed*x,speed*HEIGHT/5);
        }
        x++;
    }

    private void drawCircle(int WIDTH, int HEIGHT) {
        ellipse(WIDTH, HEIGHT,DIAMETER,DIAMETER);
    }
}
