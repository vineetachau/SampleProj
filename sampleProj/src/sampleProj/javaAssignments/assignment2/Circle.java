package sampleProj.javaAssignments.assignment2;

public class Circle extends TestShape {
	private double radius;

	  public Circle(double radius) {
	    super("Circle");
	    this.radius = radius;
	  }

	  public void draw() {
	    System.out.println("Drawing a circle...");
	  }

	  public double getArea() {
	    return Math.PI * radius * radius;
	  }

	  public double getPerimeter() {
	    return 2.0 * Math.PI * radius;
	  }
	}
