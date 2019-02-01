package refactoring_gilbut.chap07.after_factory;

public class LineFactory extends ShapeFactory {
	
	private static final ShapeFactory instance = new LineFactory();
	
	

	private LineFactory() {

	}

	public static ShapeFactory getInstance() {
		return instance;
	}

	@Override
	public ShapeAfterFactory create(int startX, int startY, int endX, int endY) {
		return new ShapeLine(startX,startY,endX,endY);
	}

}
