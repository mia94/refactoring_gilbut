package refactoring_gilbut.chap06_1.after_abstract;

public abstract class MediaAbstract {

	protected String data;
	
	public MediaAbstract(String data) {
		this.data = data;
	}
	
	public abstract void play();
	public abstract void loop();
	public abstract void stop();
	
}
