package refactoring_gilbut.chap06_1.after;

public class PlayerAfter {
	private boolean isMusic;
	private MusicAfter music = new MusicAfter("좋니");
	private VideoAfter video = new VideoAfter("효리네 민박");
	
	public void setCurrentMedia(boolean isMusic) {
		this.isMusic = isMusic;
	}
	
	public void play() {
		if(isMusic) {
			playMusic();
		}else {
			playVideo();
		}
	}
	
	public void loop() {
		if(isMusic) {
			loopMusic();
		}else {
			loopVideo();
		}
	}
	
	public void stop() {
		if(isMusic) {
			stopMusic();
		}else {
			stopVideo();
		}
	}

	private void stopVideo() {
		video.stop();
	}

	private void stopMusic() {
		music.stop();
	}

	private void loopVideo() {
		video.loop();
	}

	private void loopMusic() {
		music.loop();
		
	}

	private void playVideo() {
		video.play();
		
	}
	private void playMusic() {
		music.play();
	}
}
