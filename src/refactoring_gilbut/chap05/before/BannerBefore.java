package refactoring_gilbut.chap05.before;

public class BannerBefore {
	private final String content;

	public BannerBefore(String content) {
		this.content = content;
	}
	
	public void print(int time) {
		System.out.print("+");
		for(int i=0;i<content.length();i++) {
			System.out.print("-");
		}
		System.out.println("+");
		
		for(int i = 0;i<time;i++) {
			System.out.println("|"+content+"|");
		}
		
		System.out.print("+");
		for(int i=0;i<content.length();i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	
	
}
