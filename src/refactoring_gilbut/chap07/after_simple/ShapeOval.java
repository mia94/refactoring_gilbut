package refactoring_gilbut.chap07.after_simple;

public class ShapeOval extends ShapeAfterSimple {

	public static ShapeOval createShapeOval(int startX, int startY, int endX, int endY) {
		return new ShapeOval(startX, startY, endX, endY);
	}
	
	private ShapeOval(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	@Override
	public int getTypeCode() {
		return ShapeAfterSimple.TYPECODE_OVAL;
	}
	
	private void drawOval() {
		System.out.printf("%15s : %s%n","drawOval",this.toString());
	}

	@Override
	public String getName() {
		return "OVAL";
	}

	@Override
	public void draw() {
		drawOval();
	}
	
}
