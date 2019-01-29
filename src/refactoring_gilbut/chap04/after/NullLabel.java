package refactoring_gilbut.chap04.after;

public class NullLabel extends LabelAfter {

	public NullLabel() {
		super("(none)");
	}

	@Override
	public void display() {	}

	@Override
	public boolean isNull() {
		return true;
	}
	
	
	
}
