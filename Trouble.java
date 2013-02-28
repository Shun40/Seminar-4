
public class Trouble {
	private int number;				// トラブル番号
	public Trouble(int number) {	// コンストラクタでトラブル作成
		this.number = number;
	}
	public int getNumber() {		// トラブル番号ゲッタ
		return number;
	}
	public String toString() {		// トラブルの文字列表現
		return "[Trouble " + number + "]";
	}

}
