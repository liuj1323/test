package com.bank;


/**
 * ������, ȡ��
 * @author Administrator
 *
 */
public class TestWithdrawal {
	
	/**
	 * �������
	 * @param args
	 */
	public static void main(String[] args) {
		
		// ���������߳�
		ThreadAccount ta = new ThreadAccount(); //ȡ���̶߳���
		Thread one = new Thread(ta, "����"); //�߳�, ����
		Thread two = new Thread(ta, "����������"); //�߳�, ����������
		
		// �����߳�
		one.start();
		two.start();
	}
}
