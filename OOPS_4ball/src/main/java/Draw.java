import processing.core.PApplet;

public class Draw  {

    private int height;
    private int width;
    private int position;
    private int diameter;
    PApplet parent;

    public int getDiameter() {
        return diameter;
    }


    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Draw(PApplet p,int width, int height, int position, Ball ball) {
        this.height = height;
        parent=p;
        this.width = width;
        this.position = position;
        this.diameter = ball.getDiameter();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void drawCircle(){
        int  height = getHeight();
        for(int speed = 1; speed <= 4; speed++){
            parent.ellipse(speed*position, (speed*height)/5,getDiameter(),getDiameter());
        }
        position++;
    }
}
