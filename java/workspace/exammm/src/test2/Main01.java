package test2;

public class Main01 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		// 9.isPowerOn false�� ���·� channel, volume ���� ��, toString()���� Ȯ��
		// (�������� ó�� �� ������ ����ġ ���� ������ ��ġ�� �ʵ��� ���� ��� �������̽��� �ε��� ��ȣ�� ��� �ڵ带 ������ �� �ִ�.10)
		t.setPowerOn(false);
		t.setChannel(33);
		t.setVolume(33);
		System.out.println(t.toString());
		// 10.isPowerOn true�� ���·� channel, volume ���� ��, toString()���� Ȯ��
		//(	����Ʈ���� ��Ű��ó���� ������ Ÿ �ý��� ���� ����Ʈ �� ���� ����� �����Ͽ���Ÿ �ý��� ���� �� ������ ���̵������ �ۼ��� �� �ִ�.10)
		t.setPowerOn(true);
		t.setChannel(20);
		t.setVolume(30);
		t.toString();
		System.out.println(t.toString());		
		// 11.isPowerOn true�� ���·� channel�� ���� ��, toString()���� Ȯ��
		// (����Ʈ���� ��Ű��ó�� ���� ������ ���� �� � ȯ�濡 ���� ��������� �̵����ַ�ǿ� ���Ͽ� ���� �ۼ��� �� �ִ�.10)
		t.setPowerOn(true);		
		t.setChannel(50);
		System.out.println(t.toString());	
		// 12.gotoPrevChannel()(���� ä�η� �ǵ�����) ȣ�� ��, toString()���� Ȯ��
		// (����Ʈ���� ��Ű��ó�� ���� ������ ���� �� � ȯ�濡 ���� ��������� �̵����ַ�ǿ� ���Ͽ� ���� �ۼ��� �� �ִ�.10)
		t.gotoPrevChannel();
		System.out.println(t.toString());	
		
	}

}
// ��°��
//MyTv [isPowerOn=false, channel=0, volume=0, prevChannel=0, MAX_VOLUME=100, MIN_VOLUME=0, MAX_CHANNEL=100, MIN_CHANNEL=1]
//MyTv [isPowerOn=true, channel=20, volume=30, prevChannel=0, MAX_VOLUME=100, MIN_VOLUME=0, MAX_CHANNEL=100, MIN_CHANNEL=1]
//MyTv [isPowerOn=true, channel=50, volume=30, prevChannel=20, MAX_VOLUME=100, MIN_VOLUME=0, MAX_CHANNEL=100, MIN_CHANNEL=1]
//MyTv [isPowerOn=true, channel=20, volume=30, prevChannel=50, MAX_VOLUME=100, MIN_VOLUME=0, MAX_CHANNEL=100, MIN_CHANNEL=1]