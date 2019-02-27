package com.atgs.cycle;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	/*
	 * spring IOC ������ Bean ���������ڽ��й���Ĺ���
	 * 1> ͨ���������򹤳��������� Bean ʵ��
	 * 2>ΪBean����������ֵ�Ͷ�����Bean������
	 * 3>��bean��ʵ�����ݸ�Bean���ô������� postProcessBeforeInitinitilization ����
	 * 4>����bean�ĳ�ʼ������
	 * 5>��Beanʵ�����ݸ�Bean���ô�������postProcessAfteInittialization����
	 * 6>bean����ʹ��
	 * 7>�����ر�ʱ������bean�����ٷ���
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans-cycle.xml");
		Car car= (Car) ctx.getBean("car");
		System.out.println(car);
		//MyBeanPostProcessor myBeanPostProcessor=(MyBeanPostProcessor) ctx.getBean("myBeanPostProcessor");
		
	}
}
