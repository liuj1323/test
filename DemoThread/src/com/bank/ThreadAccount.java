package com.bank;

/**
 * �߳���, ȡ��
 * @author Administrator
 *
 */
public class ThreadAccount implements Runnable {
	
	/**
	 * ����ʹ��ThreadAccount���󴴽����̹߳���ͬһ���ʻ�����
	 */
	private Account acct = new Account();

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			
			//���÷���,  ȡ��
			makeWithdrawal(100);
			
			//�ж�, �˻����
			if (acct.getBalance() < 0) { //͸֧
				System.out.println("�˻�͸֧��!");
			}
		}
	}

	/**
	 * ȡ��
	 * @param amt ȡ����
	 */
	private void makeWithdrawal(int amt) {	
//	private synchronized void makeWithdrawal(int amt) {	
		
		synchronized (acct) {
			//�ж�, ����Ƿ����
			if (acct.getBalance() >= amt) { //������

				//��ʾ, XXX׼��ȡ��
				System.out.println(Thread.currentThread().getName() + " ׼��ȡ��");

				try {
					//0.5���ʵ��ȡ��
					Thread.sleep(500);
				} catch (InterruptedException ex) {
				}

				//ȡ��
				acct.withdraw(amt);
				

				//��ʾ, XXX���ȡ��
				System.out.println(Thread.currentThread().getName() + " ���ȡ��, ���Ϊ" + acct.getBalance());

			} else { //����

				//��ʾ, ����
				System.out.println("������֧�� " + Thread.currentThread().getName() + " ��ȡ����Ϊ " + acct.getBalance());
			}
		}
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
