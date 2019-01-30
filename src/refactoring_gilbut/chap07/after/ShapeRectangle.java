package refactoring_gilbut.chap07.after;

public class ShapeRectangle extends ShapeAfter {

	public ShapeRectangle(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	@Override
	public int getTypeCode() {
		return ShapeAfter.TYPECODE_RECTANGLE;
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
