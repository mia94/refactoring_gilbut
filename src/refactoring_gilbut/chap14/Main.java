package refactoring_gilbut.chap14;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import refactoring_gilbut.chap14.before.AddressFile;

public class Main {

	public static void main(String[] args) {
		try {
			AddressFile file = new AddressFile("address.txt");
			file.getDatabase().set("Hanjimin1", "test1@test.com");
			file.getDatabase().set("Hanjimin2", "test2@test.com");
			file.getDatabase().set("Hanjimin3", "test3@test.com");
			file.getDatabase().update();
			
			Enumeration<?> e = file.names();
			while(e.hasMoreElements()) {
				String name = (String)e.nextElement();
				String mail = file.getDatabase().get(name);
				System.out.printf("name=%s, mail=%s",name, mail);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
