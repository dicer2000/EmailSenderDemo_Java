import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.core.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 





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
