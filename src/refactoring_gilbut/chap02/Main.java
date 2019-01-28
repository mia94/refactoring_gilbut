package refactoring_gilbut.chap02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.Iterator;

import refactoring_gilbut.chap02.Simpledatabase_after_api.SimpleDatabaseAPI;
import refactoring_gilbut.chap02.Simpledatabase_after_regx.SimpleDatabaseReg;
import refactoring_gilbut.chap02.Simpledatabase_after_rename.SimpleDatabaseRename;
import refactoring_gilbut.chap02.Simpledatabase_before.SimpleDatabase;
import refactoring_gilbut.chap02.after_break.FindIntBreak;
import refactoring_gilbut.chap02.after_return.FindIntReturn;
import refactoring_gilbut.chap02.before.FindIntBefore;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,9,0,2,8,5,6,3,4,7,5};
		
		before(data);
		afterBreak(data);
		afterReturn(data);		
		before_simpledatabase();
		after_databaseRename();
		after_databaseAPI();
		after_databaseReg();
	}
	private static void after_databaseReg() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			SimpleDatabaseReg db = new SimpleDatabaseReg(new FileReader(fileUrl));
			Iterator<String> iterator = db.iterator();
			while(iterator.hasNext()) {
				String key = iterator.next();
				System.out.printf("KEY : %s%nVALUE : %s%n%n", key, db.getValue(key));
			}
		}catch (FileNotFoundException e) {
			System.err.println("해당파일을 찾을 수 없습니다.");
		}catch (IOException e) {
			System.err.println("해당파일에 문제가 있어 읽을 수 없습니다.");
		}
	}
	private static void after_databaseRename() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			SimpleDatabaseRename db = new SimpleDatabaseRename(new FileReader(fileUrl));
			Iterator<String> iterator = db.iterator();
			while(iterator.hasNext()) {
				String key = iterator.next();
				System.out.printf("KEY : %s%nVALUE : %s%n%n", key, db.getValue(key));
			}
		}catch (FileNotFoundException e) {
			System.err.println("해당파일을 찾을 수 없습니다.");
		}catch (IOException e) {
			System.err.println("해당파일에 문제가 있어 읽을 수 없습니다.");
		}
	}
	private static void after_databaseAPI() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			SimpleDatabaseAPI db = new SimpleDatabaseAPI(new FileReader(fileUrl));
			Iterator<String> iterator = db.iterator();
			while(iterator.hasNext()) {
				String key = iterator.next();
				System.out.printf("KEY : %s%nVALUE : %s%n%n", key, db.getValue(key));
			}
		}catch (FileNotFoundException e) {
			System.err.println("해당파일을 찾을 수 없습니다.");
		}catch (IOException e) {
			System.err.println("해당파일에 문제가 있어 읽을 수 없습니다.");
		}
	}
	private static void before_simpledatabase() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			SimpleDatabase db = new SimpleDatabase(new FileReader(fileUrl));
			Iterator<String> iterator = db.iterator();
			while(iterator.hasNext()) {
				String key = iterator.next();
				System.out.printf("KEY : %s%nVALUE : %s%n%n", key, db.getValue(key));
			}
		}catch (FileNotFoundException e) {
			System.err.println("해당파일을 찾을 수 없습니다.");
		}catch (IOException e) {
			System.err.println("해당파일에 문제가 있어 읽을 수 없습니다.");
		}
	}

	private static void afterReturn(int[] data) {
		if(FindIntReturn.find(data, 5)) {
			if(FindIntBefore.find(data, 5)) {
				System.out.println("Found!");
			}else {
				System.out.println("Not Found");
			}
		}
	}

	private static void afterBreak(int[] data) {
		if(FindIntBreak.find(data, 5)) {
			if(FindIntBefore.find(data, 5)) {
				System.out.println("Found!");
			}else {
				System.out.println("Not Found");
			}
		}
	}

	private static void before(int[] data) {
		if(FindIntBefore.find(data, 5)) {
			System.out.println("Found!");
		}else {
			System.out.println("Not Found");
		}
	}

}
