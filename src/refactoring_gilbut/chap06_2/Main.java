package refactoring_gilbut.chap06_2;

import refactoring_gilbut.chap06_2.after.ItemAfter;
import refactoring_gilbut.chap06_2.after.ItemType;
import refactoring_gilbut.chap06_2.after2.ItemAfter2;
import refactoring_gilbut.chap06_2.after2.ItemType2;
import refactoring_gilbut.chap06_2.before.ItemBefore;

public class Main {

	public static void main(String[] args) {
		before();
		after1();
		after2();
	}

	private static void after2() {
		ItemAfter2 book = new ItemAfter2(ItemType2.BOOK, "세계역사", 4800);
		ItemAfter2 dvd = new ItemAfter2(ItemType2.DVD, "뉴욕의 꿈 특별판", 3000);
		ItemAfter2 soft = new ItemAfter2(ItemType2.SOFTWARE, "튜링 머신 에뮬레이터", 3200);
		
		System.out.println("book = "+ book.toString());
		System.out.println("dvd = "+ dvd.toString());
		System.out.println("soft = "+soft.toString());
	}

	private static void after1() {
		ItemAfter book = new ItemAfter(ItemType.BOOK, "세계역사", 4800);
		ItemAfter dvd = new ItemAfter(ItemType.DVD, "뉴욕의 꿈 특별판", 3000);
		ItemAfter soft = new ItemAfter(ItemType.SOFTWARE, "튜링 머신 에뮬레이터", 3200);
		
		System.out.println("book = "+ book.toString());
		System.out.println("dvd = "+ dvd.toString());
		System.out.println("soft = "+soft.toString());
	}

	private static void before() {
		ItemBefore book = new ItemBefore(ItemBefore.TYPECODE_BOOK, "세계역사", 4800);
		ItemBefore dvd = new ItemBefore(ItemBefore.TYPECODE_DVD, "뉴욕의 꿈 특별판", 3000);
		ItemBefore soft = new ItemBefore(ItemBefore.TYPECODE_SOFTWARE, "튜링 머신 에뮬레이터", 3200);
		
		System.out.println("book = "+ book.toString());
		System.out.println("dvd = "+ dvd.toString());
		System.out.println("soft = "+soft.toString());
	}

}
