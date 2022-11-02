package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double length;
	private double width;

	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double findArea() {
		double area = length * width;
		return area;
	}

	public double findPerimeter() {
		double perimeter = (2 * length) + (2 * width);
		return perimeter;
	}

	public boolean isSmaller(double area1, double area2) {
		if (area1 < area2) {
			return true;
		} else {
			return false;
		}
	}
	public boolean isSquare() {
		if (length==width)
			return true;
		else
			return false;
	}
	public void draw(double x, double y) {
		StdDraw.setPenColor(Color.PINK);
		StdDraw.rectangle(x, y, 0.5*length, 0.5*width);
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(.5,.6);
		double area1 = r1.findArea();
		System.out.println("The area of a 5x6 rectangle is " + area1);
		double perimeter1 = r1.findPerimeter();
		System.out.println("The perimeter of a 5x6 rectangle is " + perimeter1);
		Rectangle r2 = new Rectangle(.3,.3);
		double area2 = r2.findArea();
		System.out.println("The area of a 3x3 rectangle is " + area2);
		double perimeter2 = r2.findPerimeter();
		System.out.println("The perimeter of a 3x3 rectangle is " + perimeter2);
		System.out.println("Is 5x6 smaller than 3x3? " + r1.isSmaller(area1, area2));
		System.out.println("Is r2 square? " + r2.isSquare());
		r1.draw(.3, .6);
		
		

		

	}

}
