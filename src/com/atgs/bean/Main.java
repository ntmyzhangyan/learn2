package com.atgs.bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	
	public static void main(String[] args) {
		/*HelloWord hw=new HelloWord();
		hw.setName("zhangyan");
		hw.hello();*/
		//1.���� spring��IOC ��������  
		//�� springIOC ������ȡBean���ô���Beanʵ��֮ǰ���������ʵ������
		//ApplicationContext����IOC���� ʵ����һ���ӿ�     ClassPathXmlApplicationContext��ApplicationContext
		//��һ��ʵ���࣬����·���������������ļ���ʵ���˶�XML�ļ��ļ��أ�
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.��IOC �����л�ȡ beanʵ��
		//����id��λ�������е�bean
		HelloWord helloWord=(HelloWord) ctx.getBean("helloword");
		//�������ͷ���IOC�����е�Bean �������ֻ��������������һ��
		//HelloWord helloWord2=ctx.getBean(HelloWord.class); 
		//3.����hello����
		helloWord.hello(); 
		Car car=(Car)ctx.getBean("car");
		System.out.println(car);
		car=(Car) ctx.getBean("car2");
		System.out.println(car);
		Person person=(Person) ctx.getBean("person");
		System.out.println(person);
		person = (Person) ctx.getBean("person2");
		System.out.println(person);
	} 
}
