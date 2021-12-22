package sampleProj.javaAssignments.assignment2;

public class Rectangle extends TestShape {
	private double width;
	  private double height;

	  public Rectangle(double width, double height) {
	    // Set the shape name as "Rectangle"
	    super();
	    this.width = width;
	    this.height = height;
	  }

	  public void draw() {
	    System.out.println("Drawing a rectangle...");
	  }

	  public double getArea() {
	    return width * height;
	  }

	  public double getPerimeter() {
	    return 2.0 * (width + height);
	  }

}
