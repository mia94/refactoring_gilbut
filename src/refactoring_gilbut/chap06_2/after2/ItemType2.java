package refactoring_gilbut.chap06_2.after2;

public enum ItemType2 {
	BOOK(0), DVD(1), SOFTWARE(2);
	
	private final int typecode;
	
	private ItemType2(int typecode) {
		this.typecode = typecode;
	}

	public int getTypecode() {
		return typecode;
	}
	
	
}
