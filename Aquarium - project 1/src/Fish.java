
import java.util.Random;


public class Fish extends DrawableImage {

	private int speed;
	private boolean movingRight;
	
	public Fish(DrawingPanel drawArea, String imageFile, int speed, boolean facingRight) {
		
		// Uses the constructor to DrawableImage to set the area, image, and image dimensions
		// to use while drawing
		super(drawArea, imageFile, 60, 40);
		
		// Set the fish speed
		this.setSpeed(speed);
		
		// Does the initial graphic show the fish facing right? If so, let the fish start
		// out moving in that direction
		this.setMovingRight(facingRight);
	}
	
	public void initialize() {
		
		int xPos, yPos;
		
		// This finds a random y coordinate to place the fish so that it is
		// not too high or too low
		Random rand = new Random();
		yPos = rand.nextInt(this.getWindowHeight() - this.getHeight());
			
		// If the fish starts moving right, start the fish at the left edge
		if (isMovingRight()) {
			xPos = 0;
			
		// Otherwise, start the fish at the right edge of the window
		} else {
			xPos = this.getWindowWidth() - this.getWidth();
		}
		
		// Set the x, y coordinates
		this.setX(xPos);
		this.setY(yPos);
	}
	
	public void moveOneStep() {
		
		int nextX = 0;
		
		// TODO: Move the fish forward this.getSpeed() pixels in the right or left
		// direction, but if it gets to the edge, reverse the direction of the fish
		
		this.setX(nextX);
	}
	
	protected void reverseDirection() {
		
		// Flips the image to be rendered 
		this.horizontalFlip();
		
		// Now change the direction of movement
		boolean movingRight = this.isMovingRight();
		this.setMovingRight(!movingRight);
	}
	

	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isMovingRight() {
		return movingRight;
	}

	public void setMovingRight(boolean movingRight) {
		this.movingRight = movingRight;
	}

}
