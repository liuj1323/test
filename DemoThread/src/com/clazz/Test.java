package com.clazz;

import com.entity.Account;

/**
 * ������, ʹ���߳�
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		
		//1. �����̶߳���
		/*MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();*/
		MyThread m1 = new MyThread("�߳�A");
		MyThread m2 = new MyThread("�߳�B");
		
		//�����߳�����
		/*m1.setName("�߳�A");
		m2.setName("�߳�B");*/
		
		//�����̵߳����ȼ�, ������Դ�������ĸߵ�(����)
		//����ֵ��Χ�ɵ͵���  1~10, Ĭ��Ϊ5
		m1.setPriority(4);
		m2.setPriority(6);
		
		//�����˻�
		m1.setAccount(new Account(500));
		m2.setAccount(new Account(500));
		
		//2. �����߳�
		m1.start();
		m2.start();
	}
}


















