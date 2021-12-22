package sampleProj.javaAssignments.assignment2;

import sampleProj.javaAssignments.assignment2.util.ShapeUtil;

public class MainShape {
	public static void main(String[] args) {
	    TestShape[] shapeList = new TestShape[2];
	    shapeList[0] = new Rectangle(2.0, 4.0);
	    shapeList[1] = new Circle(5.0);

	    ShapeUtil.drawShapes(shapeList);

	    ShapeUtil.printShapeDetails(shapeList);
	  }

}
