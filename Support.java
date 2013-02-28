
public abstract class Support {
	private String name;							// このトラブル解決者の名前
	private Support next;							// たらい回しする先
	public Support(String name) {					// コンストラクタでトラブル解決者を生成
		this.name = name;
	}
	public Support setNext(Support next) {
		this.next = next;
		return next;
	}
	// 可視性finalのメソッドはオーバーライド不可能
	public final void support(Trouble trouble) {	// トラブル解決の手順
		if(resolve(trouble)) {
			done(trouble);
		} else if(next != null) {
			next.support(trouble);
		} else {
			fail(trouble);
		}
	}
	public String toString() {						// 文字列表現
		return "[" + name + "]";
	}
	// 可視性protectedのメソッドは同じパッケージまたはこのクラスのサブクラスのみから参照可能
	protected abstract boolean resolve(Trouble trouble);	// 解決用メソッド
	protected void done(Trouble trouble) {		// 解決
		System.out.println(trouble + " is resolved by " + this + ".");
	}
	protected void fail(Trouble trouble) {		// 未解決
		System.out.println(trouble + " cannot be resolved.");
	}
}
