
public class OddSupport extends Support {
	public OddSupport(String name) {
		super(name);	// �X�[�p�[�N���X�̃R���X�g���N�^���s
	}
	protected boolean resolve(Trouble trouble) {	// �����p���\�b�h
		if(trouble.getNumber() % 2 == 1) {			// �����
			return true;
		} else {
			return false;
		}
	}
}
