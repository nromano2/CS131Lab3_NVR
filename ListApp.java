/**
 * @author Nicholas Romano
 * @version 1.0
 * Module 3 Programming Lab
 * CS131 Spring 2023
 * 
 */

public class ListApp {
	public static void main(String[] args) {
		ArrayList<PointThreeD>dimensionArray = new ArrayList<>(5);
		
		PointThreeD ThreeD_1 = new PointThreeD(1.0, 2.0, 3.0);
		dimensionArray.addItem(ThreeD_1);
		
		PointThreeD ThreeD_2 = new PointThreeD(3.1415, 2.71828, 1.2345);
		dimensionArray.addItem(ThreeD_2);
		
		PointThreeD ThreeD_3 = new PointThreeD(1.5, 3.0, 6.0);
		dimensionArray.addItem(ThreeD_3);
		
		PointThreeD ThreeD_4 = new PointThreeD(2.0, 4.0, 8.0);
		dimensionArray.addItem(ThreeD_4);
		
		PointThreeD ThreeD_5 = new PointThreeD(2.0, 3.0, 5.0);
		dimensionArray.addItem(ThreeD_5);
		
		System.out.println("Three Dimensional Array Elements: \n" + dimensionArray.toString());
		
		
		
		ArrayList<Square>squareArray = new ArrayList<>(5);
		
		Square square1 = new Square(2.0);
		squareArray.addItem(square1);
		
		Square square2 = new Square(1.0);
		squareArray.addItem(square2);
		
		Square square3 = new Square(10.0);
		squareArray.addItem(square3);
		
		Square square4 = new Square(6.0);
		squareArray.addItem(square4);
		
		Square square5 = new Square(12.0);
		squareArray.addItem(square5);
		
		System.out.println("Square Array Elements: \n" + squareArray.toString());
	
		
		
		ArrayList<String>stringArray = new ArrayList<>(3);
		
		String string1 = new String("Nick Romano");
		stringArray.addItem(string1);
		
		String string2 = new String("CS131: Object Oriented Programming");
		stringArray.addItem(string2);
		
		String string3 = new String("Module 3 Programming Lab");
		stringArray.addItem(string3);
		
		System.out.println("String Array Elements: \n" + stringArray.toString());
		
	}
}
