package com.interface_;

import com.entity.Account;

/**
 * ������, ʹ�ýӿڵ��߳�ʹ��
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		
		//1. �����Զ����̵߳Ķ���
		MyThread m = new MyThread();
		
		//�����˻�
		m.setAccount(new Account(500));
		
		//2. ���Զ����̶߳�����Ϊ����, ������ִ�е��̶߳���
		Thread t1 = new Thread(m, "��÷÷");
		Thread t2 = new Thread(m, "����");
		
		//3. �����߳�
		t1.start();
		t2.start();
	}
}


















