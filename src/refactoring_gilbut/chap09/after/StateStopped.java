package refactoring_gilbut.chap09.after;

public class StateStopped extends State {
	private static final StateStopped instance = new StateStopped();
	
	
	public static StateStopped getInstance() {
		return instance;
	}
	
	private StateStopped() {}

	@Override
	public int getTypeCode() {
		return LoggerAfter.STATE_STOPPED;
	}

	@Override
	public void start(LoggerAfter logger) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop(LoggerAfter logger) {
		System.out.println("*** STOP LOGGING ***");
		logger.setState(StateLogging.getInstance());
		
	}

	@Override
	public void log(String info) {
		System.out.println("Ignoring :"+ info);
		
	}

}
