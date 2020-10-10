/* FINAL SKETCH FOR LORENZ ATTRACTOR 

To install Processing:
Open Processing, and click the Tools -> Install “processing-java” menu item.
Install the processing-vscode 117 extension
Open your sketch folder in VS Code
NOT just the .pde file, like you would do from the Processing IDE
run Processing: Create Task File
Cmd-P + > + Create Task File
Run project: Cmd-Shift P


dx / dt = a (y - x)
dy / dt = x (b - z) - y
dz / dt = xy - c z

Constants: a = 10, b = 28, c = 8 / 3
or a = 28, b = 46.92, c = 4
*/

import peasy.*; // Importing peasy package 

// Initialization 
float x = 0.01, y = 0, z = 0; 
float a = 10, b = 28, c = 8/3; 

// ArrayList of PVector objects to store 
// the position vectors of the points to be plotted. 
ArrayList<PVector> points = new ArrayList<PVector>(); 
PeasyCam cam; // Declaring PeasyCam object 

void setup() 
{ 
	// Creating the output window 
	// and setting up the OPENGL renderer 
	size(800, 600, OPENGL); 

	// Initializing the cam object 
	cam = new PeasyCam(this, 500); 
} 

void draw() 
{ 
	background(0); 

	// Implementation of the differential equations 
	float dt = 0.01; 
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

