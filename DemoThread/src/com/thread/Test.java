package com.thread;

import com.clazz.MyThread;

/**
 * ������, �̵߳���
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		
		//��ȡ���̶߳���
		Thread main = Thread.currentThread();
		//�������߳�����
		main.setName("���߳�");
		
		//�������̶߳���
		MyThread m1 = new MyThread("���߳�-1");
		
		//�������߳�
		m1.start();
		/*try {
			m1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		for(int i = 1; i <= 100; i++) {
			
			//�ж�, ���ߵ����
			/*if(i % 5 == 0) {
				//��ͣ
				try {
					main.sleep(1000*2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}*/
			
			//����
			/*if(i % 3 == 0) {
				System.out.println(main.getName()+"����");
				main.yield();
			}*/
			
			System.out.println(main.getName() + " : " + i);
		}
	}
}











