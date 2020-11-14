package car_demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class car_run {
      public car_run() {
	  }
      @Test
      public void test1() {
		ApplicationContext apc=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Car car=apc.getBean("car1", Car.class);
		System.out.println(car);
	}
}
