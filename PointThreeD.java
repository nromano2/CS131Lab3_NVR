/**
 * The PointThreeD class is used to create an object that represents an order triple (xPoint, yPoint, zPoint).
 */

/**
 * @author Nicholas Romano
 * @version 1.0
 * Module 3 Programming Lab
 * CS131 Spring 2023
 */

public class PointThreeD {
	private Double xPoint; //Double variable used to store the xCoordinate value
	private Double yPoint; //Double variable used to store the yCoordinate value
	private Double zPoint; //Double variable used to store the zCoordinate value
	
	/**
	 * Default constructor that sets each of the coordinate values to 0.0
	 */
	public PointThreeD()
	{
		this.xPoint = 0.0;
		this.yPoint = 0.0;
		this.zPoint = 0.0;
	}
	
	/**
	 * Preferred constructor that allows the user to pass in the x, y, and z coordinates into the parameter list.
	 * The xPoint, yPoint, zPoint variables set to the values passed in the parameter list.
	 * @param xCoordinate - the value that the xPoint variable is to be set to.
	 * @param yCoordinate - the value that the yPoint variable is to be set to.
	 * @param zCoordinate - the value that the zPoint variable is to be set to.
	 */
	public PointThreeD(Double xCoordinate, Double yCoordinate, Double zCoordinate)
	{
		this.xPoint = xCoordinate;
		this.yPoint = yCoordinate;
		this.zPoint = zCoordinate;
	}
	
	/**
	 * Getter method that returns the current value of the xPoint variable
	 * @return the current value of the xPoint variable
	 */
	public Double getXPoint()
	{
		return xPoint;
	}
	
	/**
	 * Setter method that sets the xPoint variable to the value passed through the parameter lists
	 * @param the new xPoint value that the xPoint variable is to be set to
	 */
	public void setXPoint(Double xCoordinate)
	{
		this.xPoint = xCoordinate;
	}
	
	/**
	 * Getter method that returns the current value of the yPoint variable
	 * @return the current value of the yPoint variable
	 */
	public Double getYPoint()
	{
		return yPoint;
	}
	
	/**
	 * Setter method that sets the yPoint variable to the value passed through the parameter lists
	 * @param the new yPoint value that the yPoint variable is to be set to
	 */
	public void setYPoint(Double yCoordinate)
	{
		this.yPoint = yCoordinate;
	}
	
	/**
	 * Getter method that returns the current value of the zPoint variable
	 * @return the current value of the zPoint variable
	 */
	public Double getZPoint()
	{
		return zPoint;
	}
	
	/**
	 * Setter method that sets the zPoint variable to the value passed through the parameter lists
	 * @param the new yPoint value that the zPoint variable is to be set to
	 */
	public void setZPoint(Double zCoordinate)
	{
		this.xPoint = zCoordinate;
	}

	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}
	
	
}
