
public class NoSupport extends Support {
	public NoSupport(String name) {
		super(name);	// �X�[�p�[�N���X�̃R���X�g���N�^���s
	}
	protected boolean resolve(Trouble trouble) {	// �����p���\�b�h
		return false;								// �����͉����������Ȃ�
	}
}
