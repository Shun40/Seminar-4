
public class OddSupport extends Support {
	public OddSupport(String name) {
		super(name);	// スーパークラスのコンストラクタ実行
	}
	protected boolean resolve(Trouble trouble) {	// 解決用メソッド
		if(trouble.getNumber() % 2 == 1) {			// 奇数判定
			return true;
		} else {
			return false;
		}
	}
}
