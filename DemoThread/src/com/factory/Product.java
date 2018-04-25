package com.factory;

/**
 * ��Ʒʵ����
 * @author Administrator
 *
 */
public class Product {

	/** ���� */
	private int amount;
	
	/**
	 * �޲ι��췽��
	 */
	public Product() {
	}

	/**
	 * �вι��췽��
	 * @param amount ����
	 */
	public Product(int amount) {
		this.amount = amount;
	}
	
	/**
	 * ������Ʒ<br>
	 * ÿ������һ��
	 */
	public void produce(){
		//���һ����Ʒ
		this.amount++;
		System.out.println("������һ����Ʒ, ����" + this.amount + "��");
	}
	
	/**
	 * ������Ʒ<br>
	 * ÿ������һ��
	 */
	public void sale(){
		//����һ����Ʒ
		this.amount--;
		System.out.println("������һ����Ʒ, ����" + this.amount + "��");
	}
	
	/**
	 * ��������
	 */
	public synchronized void producer(){
		
		//�ж�, ��Ʒ����
		if(this.amount < 6){ //��Ʒδ����
			
			//��ʾ, XXX������һ����Ʒ, ����?��
			System.out.print(Thread.currentThread().getName());
			this.produce(); //����, ���÷���
			
			//�����߳�
			notify();
			
		}else{
			
			//��ʾ, ����
			System.out.println("�ֿ�����, ��������...");
			
			try {
				//�����߳�
				wait();
			} catch (InterruptedException e) {
			}
		}
	}
	
	/**
	 * ��������
	 */
	public synchronized void saler(){
		
		//�ж�, ��Ʒ����
		if(this.amount > 0){ //��������
			
			//��ʾ, XXX������һ����Ʒ, ����?��
			System.out.print(Thread.currentThread().getName());
			this.sale(); //����, ���÷���
			
			//�����߳�
			notify();
			
		}else{
			
			//��ʾ, ��治��
			System.out.println("��治��, �����ĵȴ�...");
			
			try {
				//�����߳�
				wait();
			} catch (InterruptedException e) {
			}
			
		}
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
