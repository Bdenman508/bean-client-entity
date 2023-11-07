/**
 * 
 */
package cogent.learning.cleint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cogent.learning.entity.Book;
import cogent.learning.entity.Person;

/**
 * @author Bryan Denman
 * @date: Dec 12, 2022
 * 
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("spring/beans.xml");
//		Book bk= ctx.getBean("bean",Book.class);
		Person psn = ctx.getBean(Person.class);
		
//		int bookId=bk.getBookId();
//		String bookName=bk.getBookName();
//		double price=bk.getPrice();
		
		String name=psn.getName();
		int age=psn.getAge();
		
		System.out.println("Person name is: "+name);
		System.out.println("Person age is: "+age);
		
//		
//		System.out.println("The Book Id is: "+bookId);
//		System.out.println("For Book: "+bookName);
//		System.out.println("The Book Price is $"+price);
//		
	}

}
