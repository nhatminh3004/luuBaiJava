package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import lib.Coach;

public class Spring02_Di {
		 public static void main(String[] args) {
			ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
			Coach theCoach = context.getBean("myCoach",Coach.class);
			System.out.println(theCoach.getDailyCoach());
			System.out.println(theCoach.getFortuneCoach());
			
		}
}
