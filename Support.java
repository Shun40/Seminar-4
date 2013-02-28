
public abstract class Support {
	private String name;							// ���̃g���u�������҂̖��O
	private Support next;							// ���炢�񂵂����
	public Support(String name) {					// �R���X�g���N�^�Ńg���u�������҂𐶐�
		this.name = name;
	}
	public Support setNext(Support next) {
		this.next = next;
		return next;
	}
	// ����final�̃��\�b�h�̓I�[�o�[���C�h�s�\
	public final void support(Trouble trouble) {	// �g���u�������̎菇
		if(resolve(trouble)) {
			done(trouble);
		} else if(next != null) {
			next.support(trouble);
		} else {
			fail(trouble);
		}
	}
	public String toString() {						// ������\��
		return "[" + name + "]";
	}
	// ����protected�̃��\�b�h�͓����p�b�P�[�W�܂��͂��̃N���X�̃T�u�N���X�݂̂���Q�Ɖ\
	protected abstract boolean resolve(Trouble trouble);	// �����p���\�b�h
	protected void done(Trouble trouble) {		// ����
		System.out.println(trouble + " is resolved by " + this + ".");
	}
	protected void fail(Trouble trouble) {		// ������
		System.out.println(trouble + " cannot be resolved.");
	}
}
