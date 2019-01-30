package refactoring_gilbut.chap06_1.after_abstract;

public class MusicAbstract extends MediaAbstract {
	
	public MusicAbstract(String data) {
		super(data);
	}

	@Override
	public void play() {
		System.out.printf("%s %s%n", data, "play");
	}

	@Override
	public void loop() {
		System.out.printf("%s %s%n", data, "loop");
	}

	@Override
	public void stop() {
		System.out.printf("%s %s%n", data, "stop");
	}
	
	
}
