package refactoring_gilbut.chap07.after;

public class ShapeOval extends ShapeAfter {

	public ShapeOval(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	@Override
	public int getTypeCode() {
		return ShapeAfter.TYPECODE_OVAL;
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
