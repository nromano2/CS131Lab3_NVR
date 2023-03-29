/**
 * The square class is designed to create square objects with a given side and then calculates its area.
 */

/**
 * @author Nicholas Romano
 * @version 1.0
 * Module 3 Programming Lab
 * CS131 Spring 2023
 */

public class Square {
	private Double side; //variable used to store the side length of the Square
	
	/**
	 * Default constructor that initializes the side variable to 1.o;
	 */
	public Square()
	{
		this.side = 1.0;
	}
	
	/**
	 * Preferred constructor that initializes the side variable to the value passed through the parameter list.
	 * @param sideLength - the value the side variable is to be set to.
	 */
	public Square(Double sideLength)
	{
		setSide(sideLength);
	}
	
	/**
	 * Getter method that returns the current value of the side variable
	 * @return the current value of the side variable
	 */
	public Double getSide()
	{
		return side;
	}
	
	/**
	 * Setter method that sets the side length variable to the value passed through the parameter list after checking for a valid sideLength value.
	 * The setter method checks to see if the value passed through the parameter list is less than 0, 
	 * if so the side variable is set to the absolute value of the value passed through the parameter list.
	 * @param sideLength
	 */
	public void setSide(Double sideLength)
	{
		if(sideLength < 0)
		{
			this.side = Math.abs(sideLength);
		}
		else 
		{
			this.side = sideLength;
		}
	}
	
	/**
	 * The getArea method returns the area of the square object.
	 * @return area of the square.
	 */
	public Double getArea()
	{
		return Math.pow(side, 2);
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", area=" + getArea() + "]";
	}
	
	
}
