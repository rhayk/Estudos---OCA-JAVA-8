package Exame_02;

public class _15_Equality {

	private String word;
	_15_Equality(String word) {this.word = word;}

	public static void main(String[] args) {
		_15_Equality e1 = new _15_Equality("howdy");
		_15_Equality e2 = new _15_Equality("howdy");
		if(e1.equals(e2)) System.out.println(e1 == e2);
	}
	public String getWord() {return word;}
	public boolean equals(Object o) {
		if(((_15_Equality)o).getWord() == word) {
			System.out.print("Equals! "); return true;
		}else { System.out.print("Equals... not!"); return false;
	}
	}
}
