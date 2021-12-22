package sampleProj.javaAssignments.assignment2.util;

import sampleProj.javaAssignments.assignment2.TestShape;

public class ShapeUtil {

	  public static void drawShapes(TestShape[] list) {
	    for (int i = 0; i < list.length; i++) {
	      list[i].draw();
	    }
	  }

	  public static void printShapeDetails(TestShape[] list) {
	    for (int i = 0; i < list.length; i++) {
	      String name = list[i].getName();
	      double area = list[i].getArea();
	      double perimeter = list[i].getPerimeter();
	      System.out.println("Name: " + name);
	      System.out.println("Area: " + area);
	      System.out.println("Perimeter: " + perimeter);
	    }
	  }


}
