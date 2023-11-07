/**
 * 
 */
package cogent.learning.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cogent.learning.entity.Person;

/**
 * @author Bryan Denman
 * @date: Dec 12, 2022
 * 
 */
@Configuration
public class ApplicationBeans {
	@Bean(name="person")
	public Person getPerson() {
		Person p = new Person();
		p.setName("Bryan");
		p.setAge(20);
		return p;
	}
}
