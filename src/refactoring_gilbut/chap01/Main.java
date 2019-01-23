package refactoring_gilbut.chap01;

import refactoring_gilbut.chap01.after.RobotSymbolicConstant;
import refactoring_gilbut.chap01.after2.RobotCommandClass;
import refactoring_gilbut.chap01.before.RobotMagicNumber;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		before();
		after();
		System.out.println("after2Main()");
		RobotCommandClass robot = new RobotCommandClass("Andrew");
		robot.order(RobotCommandClass.COMMAND_WALK);//walk
		robot.order(RobotCommandClass.COMMAND_STOP);//stop
		robot.order(RobotCommandClass.COMMAND_JUMP);//jump 

	}

	private static void after() {
		System.out.println("afterMain()");
		RobotSymbolicConstant robot = new RobotSymbolicConstant("Andrew");
		robot.order(RobotSymbolicConstant.COMMAND_WALK);//walk
		robot.order(RobotSymbolicConstant.COMMAND_STOP);//stop
		robot.order(RobotSymbolicConstant.COMMAND_JUMP);//jump 
	}

	private static void before() {
		System.out.println("beforeMain()");
		RobotMagicNumber robot = new RobotMagicNumber("Andrew");
		robot.order(0);//walk
		robot.order(1);//stop
		robot.order(2);//jump 
	}

}
