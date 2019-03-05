package cn.itcast.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
	@Test
	public void testBook() {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Book book = (Book)context.getBean("book");
		book.add();
	}
}
