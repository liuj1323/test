package com.bank;

/**
 * �����ʻ���
 * @author Administrator
 * 
 */
public class Account {
	
	/** ��� */
	private int balance = 600; 

	/**
	 * ��ȡ���
	 * @return �˻����
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * ȡ��
	 * @param amount ȡ������
	 */
	public void withdraw(int amount) {
		balance -= amount;
	}
}
