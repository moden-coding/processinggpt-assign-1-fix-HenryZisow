import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }
    public void settings() {
        size(400, 400);
    }

    public void setup() {
        background(173, 216, 230);
    }

    public void draw() {
        fill (67, 41, 93);
        stroke (0,255,0);
        strokeWeight(3);
        rect(100, 50, 50, 150);
        fill (10, 62, 92);
        stroke (0,0,255);
        strokeWeight(3);
        ellipse(65, 300, 65, 65);
        stroke (0);
        line(125,100,65,300);
        
    }
}
