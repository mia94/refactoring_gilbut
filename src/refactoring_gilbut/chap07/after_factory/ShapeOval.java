package refactoring_gilbut.chap07.after_factory;

public class ShapeOval extends ShapeAfterFactory {

	public ShapeOval(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	@Override
	public int getTypeCode() {
		return ShapeAfterFactory.TYPECODE_OVAL;
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
