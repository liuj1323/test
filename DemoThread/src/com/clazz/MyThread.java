package com.clazz;

import com.entity.Account;

/**
 * �ҵ��߳�
 * @author Administrator
 *
 */
/* �����߳����API,1: �̳��� Thread */
/*
 * ��д, run����
 * */
public class MyThread extends Thread {

	/** �˻����� */
	private Account account;
	
	public MyThread() {
	}

	/**
	 * ���ι��췽��
	 * @param name �߳�����
	 */
	public MyThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		/* ���1~100 */
		for(int i = 1; i <= 100; i++) {
			
			//�ж�, �Ƿ�����
			/*if(i % 3 == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}*/
			
			//�������
			System.out.println(
					Thread.currentThread().getName()//��ǰ�̵߳�����
					+ " : " + i
			);
		}
		
		/*int i = 0;
		
		while(account.getBalance() > 0) {
			
			account.setBalance(account.getBalance()-100);
			
			System.out.println(Thread.currentThread().getName()+
					"��"+ ++i + "�β���, ��ǰ���Ϊ" + account.getBalance());
		}*/
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}










