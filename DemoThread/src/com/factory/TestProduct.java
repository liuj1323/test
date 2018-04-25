package com.factory;

public class TestProduct {

	public static void main(String[] args) throws Exception {
		
		//��������
		Product product = new Product(1); //��Ʒ����
		ThreadSaleProduct tsp = new ThreadSaleProduct(product); //����Ʒ�̶߳���
		ThreadProduceProduct tpp = new ThreadProduceProduct(product); //������Ʒ�̶߳���
		
		//�����߳�
		Thread tspA = new Thread(tsp, "����");
		Thread tspB = new Thread(tpp, "����");
		
		//��ʼ�߳�
		tspB.start();
		tspA.start();
	}
}
