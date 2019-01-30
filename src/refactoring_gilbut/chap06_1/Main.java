package refactoring_gilbut.chap06_1;

import refactoring_gilbut.chap06_1.after.PlayerAfter;
import refactoring_gilbut.chap06_1.after_abstract.MediaAbstract;
import refactoring_gilbut.chap06_1.after_abstract.MusicAbstract;
import refactoring_gilbut.chap06_1.after_abstract.PlayerAbstract;
import refactoring_gilbut.chap06_1.after_abstract.VideoAbstract;
import refactoring_gilbut.chap06_1.before.PlayerBefore;

public class Main {

	public static void main(String[] args) {
		before();
		after();
		after_abstract();
		
	}

	private static void after_abstract() {
		MediaAbstract music = new MusicAbstract("좋니");
		MediaAbstract video = new VideoAbstract("효리네 민박");
		
		PlayerAbstract musicPlayer = new PlayerAbstract();
		musicPlayer.setMedia(music);
		
		PlayerAbstract videoPlayer = new PlayerAbstract();
		videoPlayer.setMedia(video);
		
		play(musicPlayer);
		play(videoPlayer);
	}

	private static void play(PlayerAbstract player) {
		player.play();
		player.loop();
		player.stop();
	}


	private static void after() {
		PlayerAfter musicPlayer = new PlayerAfter();
		musicPlayer.setCurrentMedia(true);
		PlayerAfter videoPlayer = new PlayerAfter();
		videoPlayer.setCurrentMedia(false);
		
		Play(musicPlayer);
		Play(videoPlayer);
	}

	private static void before() {
		PlayerBefore musicPlayer = new PlayerBefore();
		musicPlayer.setCurrentMedia(true);
		
		PlayerBefore videoPlayer = new PlayerBefore();
		videoPlayer.setCurrentMedia(false);
		
		Play(musicPlayer);
		Play(videoPlayer);
	}
	
	private static void Play(PlayerAfter player) {
		player.play();
		player.loop();
		player.stop();
	}
	
	private static void Play(PlayerBefore player) {
		player.play();
		player.loop();
		player.stop();
	}

}
