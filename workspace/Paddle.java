//
//  Class author:  Hitesh Konduru
//  Date created:  12/3/24
//  General description: This class creates all the methods and constructors to allow the paddle to be created and have its movements.
//
import java.awt.*;

public class Paddle {

	//your code here!
	
	//don't forget you need instance variables:
private int x;
private int y;
private int width; 
private int height;
private int velocity;


	
	//constructor(s):
	public Paddle(int initX, int initY, int initWidth, int initHeight){
		x = initX;
		y = initY;
		width = initWidth;
		height = initHeight;
		}
	//methods:
//
//  Pre-condition: not null
//  Post-condition:an orange paddle will be created 
//

	public void draw(Graphics g){
	g.setColor(Color.orange); // call first to set the desired color
	g.fillRect(x, y, width, height); // draws a paddle(player)
}
public void setX(int x1){
	x = x1;
}
public int getX(){
return x;
}	
public void setY(int y1){
	y = y1;
}
public int getY(){
return y;
}	
public void setWidth(int width){
	width = this.width;
}
public int getWidth(){
return width;
}	
public void setHeight(int height){
	height = this.height;
}
public int getHeight(){
return height;
}	

public void setVelocity(int velocity) {
 velocity = this.velocity;
}
public int getVelocity(){
	return velocity;
}
//
//  Pre-condition: none
//  Post-condition:the paddle will move horizontally, and it won't go too slow or too fast and be sent off of the screen based on the boolean limitations
//
public void move() {
	x += velocity;
	if (x < 0) {x = 0;}
	if (x > 600) {x = 600;}
	if(velocity > 0){
		velocity --;
	}
	if(velocity<0){
		velocity ++;
	}
}
//
//  Pre-condition: a single int number to add the velocity needs to be entered when this function is called
//  Post-condition:the velocity of the paddle will get something added to it
//
public int addVelocity(int velocity1) {
	velocity += velocity1;
	return velocity;
}








}
