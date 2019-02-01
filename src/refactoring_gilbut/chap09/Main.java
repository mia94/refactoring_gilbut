package refactoring_gilbut.chap09;

import refactoring_gilbut.chap09.after.LoggerAfter;
import refactoring_gilbut.chap09.before.LoggerBefore;

public class Main {

	public static void main(String[] args) {
		before();
		after();
	}

	private static void after() {
		LoggerAfter logger = new LoggerAfter();
		logger.log("infomation #1");
		
		logger.start();
		logger.log("infomation #2");
		
		logger.start();
		logger.log("infomation #3");
		
		logger.stop();
		logger.log("infomation #4");
		
		logger.stop();
		logger.log("infomation #5");
	}

	private static void before() {
		LoggerBefore logger = new LoggerBefore();
		logger.log("infomation #1");
		
		logger.start();
		logger.log("infomation #2");
		
		logger.start();
		logger.log("infomation #3");
		
		logger.stop();
		logger.log("infomation #4");
		
		logger.stop();
		logger.log("infomation #5");
	}

}
