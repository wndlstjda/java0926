
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ڿ�
		// �Ʒ��� ����� ���ÿ� a ��� �̸��� ���ڿ��̶�� �����͸� ����
		String a = "���ڿ�";
		// ����
		int b = 1;
		// ���� ��, ����
		boolean flg = false; // true
		
		// ���ڿ� ���� a �� ���
		System.out.println("a = " + a);
		a = "���� ����";
		System.out.println("a = " + a);
		
		// ���� ���� b �� ���
		System.out.println("b = " + b);
		b = 2;
		System.out.println("b = " + b);
		
		// �� ���� flg �� ��� �غ�
		// ���࿡ ���̸� a �� ��� ���࿡ �����̸� b �� ���
		flg = true;
		if (flg == true) {
			// flg �� ���̸� ���� ����
			System.out.println("flg : a = " + a);
		}
		
		if (flg == false) {
			System.out.println("flg : b = " + b);
		}
		
		flg = false; // �������� ����
		if (flg) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		
		// ���� ������ ���� �԰� ������ ���� ����.
		int don = 0;
		System.out.println("���� ���� ����?? " + don);
		System.out.println("���� ���ٰ� �� 100���� �ֿ���.");
		don = 100;
		if (don > 0) {
			System.out.println("���� ���� �� �ִ�. ����~~");
		} else {
			System.out.println("���� ���� ������!!!");
		}
		
		// ���� ī�尡 ������ ��Ÿ�� ���� ������ �ɾ��.
	}

}
