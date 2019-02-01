package refactoring_gilbut.chap07.after_simple;

public class ShapeRectangle extends ShapeAfterSimple {
	
	public static ShapeRectangle createShapeRectangle(int startX, int startY, int endX, int endY) {
		return new ShapeRectangle(startX, startY, endX, endY);
	}
	
	private ShapeRectangle(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	@Override
	public int getTypeCode() {
		return ShapeAfterSimple.TYPECODE_RECTANGLE;
	}
	
	private void drawRectangle() {
		System.out.printf("%15s : %s%n","drawRectangle",this.toString());
	}

	@Override
	public String getName() {
		return "RECTANGLE";
	}

	@Override
	public void draw() {
		drawRectangle();
	}
	

}
