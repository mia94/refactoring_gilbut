package refactoring_gilbut.chap07.after_factory;


public class OvalFactory extends ShapeFactory {
	
	private static final ShapeFactory instance = new OvalFactory();

	public OvalFactory() {

	}

	public static ShapeFactory getInstance() {
		return instance;
	}

	@Override
	public ShapeAfterFactory create(int startX, int startY, int endX, int endY) {
		// TODO Auto-generated method stub
		return new ShapeOval(startX,startY,endX,endY);
	}

}
