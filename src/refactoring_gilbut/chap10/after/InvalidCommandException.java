package refactoring_gilbut.chap10.after;

@SuppressWarnings("serial")
public class InvalidCommandException extends Exception {
	
	public InvalidCommandException() {
		
	}
	
	public InvalidCommandException(String name) {
		super(name);
	}
}
