package refactoring_gilbut.chap07.after;

public class ShapeLine extends ShapeAfter {

	public ShapeLine(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTypeCode() {
		return ShapeAfter.TYPECODE_LINE;
	}
	
	private void drawLine() {
		System.out.printf("%15s : %s%n","drawLine",this.toString());
	}

	@Override
	public String getName() {
		return "LINE";
	}

	@Override
	public void draw() {
		drawLine();
	}
	
}
