package refactoring_gilbut.chap03;

import java.util.Random;

import refactoring_gilbut.chap03.after.SortSampleAfter;
import refactoring_gilbut.chap03.before.SortSampleBefore;

public class Main {
	private static final Random rnd = new Random(1234);

	public static void main(String[] args) {
		execute(10);
		execute(10);
		execute(10);
		execute(10);
		execute(10);
		
		execute_after(10);
		execute_after(10);
		execute_after(10);
		execute_after(10);
		execute_after(10);

	}
	
	private static void execute_after(int length) {
		int[] data = new int[length];
		for(int i=0;i<data.length;i++) {
			data[i] = rnd.nextInt(data.length);
		}
		
		SortSampleAfter sorter = new SortSampleAfter(data);
		System.out.printf("%6s : %s%n","Before",sorter);
		
		sorter.sort();
		System.out.printf("%6s : %s%n","After",sorter);
		
		System.out.println();
	}

	
	private static void execute(int length) {
		int[] data = new int[length];
		for(int i=0;i<data.length;i++) {
			data[i] = rnd.nextInt(data.length);
		}
		
		SortSampleBefore sorter = new SortSampleBefore(data);
		System.out.printf("%6s : %s%n","Before",sorter);
		
		sorter.sort();
		System.out.printf("%6s : %s%n","After",sorter);
		
		System.out.println();
	}

}
