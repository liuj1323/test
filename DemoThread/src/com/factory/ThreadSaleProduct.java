package com.factory;

/**
 * �߳���, ����Ʒ
 * @author Administrator
 *
 */
public class ThreadSaleProduct implements Runnable {

	/** ��Ʒ */
	private Product product;

	/**
	 * �вι��췽��
	 * @param product ��Ʒ
	 */
	public ThreadSaleProduct(Product product) {
		this.product = product;
	}

	@Override
	public void run() {
		
		//ѭ��, ����Ʒ
		while(true){
			
			try {
				Thread.sleep((int)(Math.random()*3000));
			} catch (InterruptedException e) {
			}
			
			//����Ʒ, ���÷���
			this.product.saler();
		}
	}

	
}
