
public class SpecialSupport extends Support {
	private int number;									// この番号だけを解決できる
	public SpecialSupport(String name, int number) {	// コンストラクタ
		super(name);
		this.number = number;		// スーパークラスのコンストラクタ実行
	}
	protected boolean resolve(Trouble trouble) {		// 解決用メソッド
		if(trouble.getNumber() == number) {
			return true;
		} else {
			return false;
		}
	}
}
