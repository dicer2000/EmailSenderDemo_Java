import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import peasy.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lorenz extends PApplet {

/* FINAL SKETCH FOR LORENZ ATTRACTOR 

dx / dt = a (y - x)
dy / dt = x (b - z) - y
dz / dt = xy - c z

Constants: a = 10, b = 28, c = 8 / 3
or a = 28, b = 46.92, c = 4
*/

 // Importing peasy package 

// Initialization 
float x = 0.01f, y = 0, z = 0; 
float a = 10, b = 28, c = 8/3; 

// ArrayList of PVector objects to store 
// the position vectors of the points to be plotted. 
ArrayList<PVector> points = new ArrayList<PVector>(); 
PeasyCam cam; // Declaring PeasyCam object 

public void setup() 
{ 
	// Creating the output window 
	// and setting up the OPENGL renderer 
	 

	// Initializing the cam object 
	cam = new PeasyCam(this, 500); 
} 

public void draw() 
{ 
	background(0); 

	// Implementation of the differential equations 
	float dt = 0.01f; 
	float dx = (a * (y - x)) * dt; 
	float dy = (x * (b - z) - y) * dt; 
	float dz = (x * y - c * z) * dt; 
	x += dx; 
	y += dy; 
	z += dz; 

	// Adding the position vectors to points ArrayList 
	points.add(new PVector(x, y, z)); 
	translate(0, 0, -80); 
	scale(5); 
	stroke(218,112,214); 
	noFill(); 

	// Beginning plotting of points 
	beginShape(); 
	for (PVector v : points) { 
		// Adding random color to the structure in each frame 
		stroke(255,0,0,255);	//random(0, 255), random(0, 255), random(0, 255)); 
		vertex(v.x, v.y, v.z); // plotting the vertices 
	} 
	endShape(); // Drawing ends 
} 

  public void settings() { 	size(800, 600, OPENGL); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lorenz" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
