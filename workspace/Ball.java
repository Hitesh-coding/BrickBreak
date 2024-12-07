//
//  Class author:  Hitesh Konduru
//  Date created:  12/3/24
//  General description: This class creates all the methods and constructors to allow the ball to be created and have its movements.
//


import java.awt.*;

public class Ball {
	//your code here!
	
	//don't forget you need instance variables:
	private int xPos;
	private int yPos;
	private int size;
	private int XVelocity;
	private int YVelocity;


	


	//constructor(s):
	public Ball(int initXPos, int initYPos, int initSize){
	xPos = initXPos;
	yPos = initYPos;
	 size = initSize;

	 XVelocity=1;
	 YVelocity=1;
	}
	//methods:
//
//  Pre-condition: not null
//  Post-condition:a yellow ball will be created 
//
public void draw(Graphics g){
	g.setColor(Color.yellow); // call first to set the desired color
	g.fillOval(xPos , yPos, size, size); // draws an oval (ball)
}

public int getSize(){
	return size;
}

   public void setSize(int size)
    {
        size  = this.size;
    }
	public void setX(int xPos3)
	{
		xPos = xPos3;
	}
	public int getXpos(){
		return xPos;
	}
	
	  
		public void setY(int yPos3)
			{
				yPos = yPos3;
			}

	public int getYpos(){
			return yPos;
		}
		
    


	public int getXVelocity(){
		return XVelocity;
	}

	
public void setXVelocity(int XVelocity)
		{
			XVelocity= this.XVelocity;
		}
//
//  Pre-condition: none
//  Post-condition:the ball will move in the horizontally opposite direction
//
public void reverseX() {
	XVelocity = -XVelocity;
	
}
public int getYVelocity() {
	return YVelocity;
}
public void setYVelocity(int YVelocity)
		{
			 YVelocity = this.YVelocity;
		}
//
//  Pre-condition: none
//  Post-condition:the ball will move in the vertically opposite direction
//
public void reverseY() {
	YVelocity = -YVelocity;

}
//
//  Pre-condition: none
//  Post-condition:the ball will move horizontally and vertically
//
public void move() {
	xPos += XVelocity;
	yPos += YVelocity;
}

}
