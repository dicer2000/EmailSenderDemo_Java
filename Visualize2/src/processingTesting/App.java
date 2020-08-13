package processingTesting;
import processing.core.PApplet;

public class App extends PApplet {

	public void settings() {
		size(500, 500);
	}

	public void draw(){
		background(64);
		ellipse(mouseX, mouseY, 20, 20);
	}
  
	public static void main(String args[]) {
	//	PApplet.main(App.class.getCanonicalName());
		PApplet.main(App.class.getCanonicalName());
    }
}