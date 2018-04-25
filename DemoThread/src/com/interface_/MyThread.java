package com.interface_;

import com.entity.Account;

/**
 * �ҵ��߳���
 * @author Administrator
 *
 */
/* ʵ���̵߳�API, 2: ʵ�ֽӿ�, Runnable */
public class MyThread implements Runnable {

	private int i = 1;
	
	/** �˻����� */
	private Account account;
	
	@Override
	public synchronized void run() {
		/* ���1~100 */
		/*for(; i <= 100; i++) {
			//�������
			System.out.println(
					Thread.currentThread().getName()//��ǰ�̵߳�����
					+ " : " + i
			);
		}*/
		int i = 0;
		
		while(account.getBalance() > 0) {
			
			account.setBalance(account.getBalance()-100);
			
			System.out.println(Thread.currentThread().getName()+
					"��"+ ++i + "�β���, ��ǰ���Ϊ" + account.getBalance());
		}
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
