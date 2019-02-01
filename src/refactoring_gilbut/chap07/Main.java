package refactoring_gilbut.chap07;

import java.util.Arrays;
import java.util.List;

import refactoring_gilbut.chap07.after.ShapeAfter;
import refactoring_gilbut.chap07.after_factory.LineFactory;
import refactoring_gilbut.chap07.after_factory.OvalFactory;
import refactoring_gilbut.chap07.after_factory.RectangleFactory;
import refactoring_gilbut.chap07.after_factory.ShapeAfterFactory;
import refactoring_gilbut.chap07.after_simple.ShapeAfterSimple;
import refactoring_gilbut.chap07.after_simple.ShapeLine;
import refactoring_gilbut.chap07.after_simple.ShapeOval;
import refactoring_gilbut.chap07.after_simple.ShapeRectangle;
import refactoring_gilbut.chap07.before.ShapeBefore;

public class Main {

	public static void main(String[] args) {
		before();
		after();
		after_factory();
		
		List<ShapeAfterSimple> shapes = Arrays.asList(
				ShapeLine.createShapeLine(0, 0, 100, 200),
				ShapeRectangle.createShapeRectangle(10, 20, 30, 40),
				ShapeOval.createShapeOval(100, 200, 300, 400)
				);
		for(ShapeAfterSimple s : shapes) {
			s.draw();
		}
	}

	private static void after_factory() {
		List<ShapeAfterFactory> shapes = Arrays.asList(
				ShapeAfterFactory.createShape(LineFactory.getInstance(), 0, 0, 100, 200),
				ShapeAfterFactory.createShape(RectangleFactory.getInstance(), 10, 20, 30, 40),
				ShapeAfterFactory.createShape(OvalFactory.getInstance(), 100, 200, 300, 400),
				ShapeAfterFactory.createShape(OvalFactory.getInstance(), 100, 200, 300, 400)
				);
		for(ShapeAfterFactory s : shapes) {
			s.draw();
		}
	}

	private static void after() {
		List<ShapeAfter> shapes = Arrays.asList(
				ShapeAfter.createShape(ShapeAfter.TYPECODE_LINE, 0, 0, 100, 200),
				ShapeAfter.createShape(ShapeAfter.TYPECODE_RECTANGLE, 10, 20, 30, 40),
				ShapeAfter.createShape(ShapeAfter.TYPECODE_OVAL, 100, 200, 300, 400)
				);
		for(ShapeAfter s : shapes) {
			s.draw();
		}
	}

	private static void before() {
		List<ShapeBefore> shapes = Arrays.asList(
				new ShapeBefore(ShapeBefore.TYPECODE_LINE, 0, 0, 100, 200),
				new ShapeBefore(ShapeBefore.TYPECODE_RECTANGLE, 10, 20, 30, 40),
				new ShapeBefore(ShapeBefore.TYPECODE_OVAL, 100, 200, 300, 400)
				);
		for(ShapeBefore s : shapes) {
			s.draw();
		}
	}

}
