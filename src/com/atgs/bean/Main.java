package com.atgs.bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	
	public static void main(String[] args) {
		/*HelloWord hw=new HelloWord();
		hw.setName("zhangyan");
		hw.hello();*/
		//1.创建 spring的IOC 容器对象  
		//在 springIOC 容器读取Bean配置创建Bean实例之前。必须进行实例化，
		//ApplicationContext代表IOC容器 实际是一个接口     ClassPathXmlApplicationContext是ApplicationContext
		//的一个实现类，从类路径下来加载配置文件（实现了对XML文件的加载）
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.从IOC 容器中获取 bean实例
		//利用id定位到容器中的bean
		HelloWord helloWord=(HelloWord) ctx.getBean("helloword");
		//利用类型返回IOC容器中的Bean 但这个类只能在配置中配置一次
		//HelloWord helloWord2=ctx.getBean(HelloWord.class); 
		//3.调用hello方法
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
