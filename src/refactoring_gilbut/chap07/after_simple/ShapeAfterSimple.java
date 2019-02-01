package refactoring_gilbut.chap07.after_simple;

public abstract class ShapeAfterSimple {
	public static final int TYPECODE_LINE = 0;
	public static final int TYPECODE_RECTANGLE = 1;
	public static final int TYPECODE_OVAL = 2;
	
	private final int startX;
	private final int startY;
	private final int endX;
	private final int endY;
	
	

	public abstract int getTypeCode();
	
	public abstract String getName();
	
	public abstract void draw();

	@Override
	public String toString() {
		return String.format("[%-10s, (%3s, %3s) - (%3s, %3s)]", getName(), startX, startY, endX, endY);
	}
	
	public ShapeAfterSimple(int startX, int startY, int endX, int endY) {
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}
	
	
}























