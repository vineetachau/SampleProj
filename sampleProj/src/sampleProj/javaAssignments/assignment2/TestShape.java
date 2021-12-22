package sampleProj.javaAssignments.assignment2;

public abstract class TestShape {
	private String name;

	  public TestShape() {
	    this.name = "Unknown shape";
	  }

	  public TestShape(String name) {
	    this.name = name;
	  }

	  public String getName() {
	    return this.name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public abstract void draw();

	  public abstract double getArea();

	  public abstract double getPerimeter();

}
