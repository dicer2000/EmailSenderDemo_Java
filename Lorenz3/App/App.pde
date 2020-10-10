import processing.core.*;

public class App extends PApplet {

  public void settings() {
    size(500, 500);
  }

  public void draw(){
    background(64);
    ellipse(mouseX, mouseY, 20, 20);
  }
  
  public static void main(String[] passedArgs) {
    App mySketch = new App();
    String[] processingArgs = {"App"};
    PApplet.runSketch(processingArgs, mySketch);
    }
}
