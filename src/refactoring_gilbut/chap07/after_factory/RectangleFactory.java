package refactoring_gilbut.chap07.after_factory;


public class RectangleFactory extends ShapeFactory {

	private static final ShapeFactory instance = new RectangleFactory();	
	
	public RectangleFactory() {
	}

	public static ShapeFactory getInstance() {
		return instance;
	}

	@Override
	public ShapeAfterFactory create(int startX, int startY, int endX, int endY) {
		// TODO Auto-generated method stub
		return new ShapeRectangle(startX,startY,endX,endY);
	}

}
