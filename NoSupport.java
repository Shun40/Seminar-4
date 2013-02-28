
public class NoSupport extends Support {
	public NoSupport(String name) {
		super(name);	// スーパークラスのコンストラクタ実行
	}
	protected boolean resolve(Trouble trouble) {	// 解決用メソッド
		return false;								// 自分は何も処理しない
	}
}
