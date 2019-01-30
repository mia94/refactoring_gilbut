package refactoring_gilbut.chap07;

import java.util.Arrays;
import java.util.List;

import refactoring_gilbut.chap07.before.ShapeBefore;

public class Main {

	public static void main(String[] args) {
		before();
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
