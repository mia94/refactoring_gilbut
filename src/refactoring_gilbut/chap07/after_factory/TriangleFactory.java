package refactoring_gilbut.chap07.after_factory;

public class TriangleFactory extends ShapeFactory {
	
	private static final ShapeFactory instance = new TriangleFactory();

	public TriangleFactory() {
		
	}

	public static ShapeFactory getInstance() {
		return instance;
	}

	@Override
	public ShapeAfterFactory create(int startX, int startY, int endX, int endY) {
		// TODO Auto-generated method stub
		return new ShapeTriangle(startX,startY,endX,endY);
	}	
	
	
	
	
}
