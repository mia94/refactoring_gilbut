package refactoring_gilbut.chap06_1.after_abstract;

public class PlayerAbstract {
	private MediaAbstract media;
	
	public void setMedia(MediaAbstract media) {
		this.media = media;
	}
	
	public void play() {
		media.play();
	}
	
	public void loop() {
		media.loop();
	}
	
	public void stop() {
		media.stop();
	}
}
