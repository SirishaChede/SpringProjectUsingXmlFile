package CustomerOrderExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//we can use xml configuration for this code
public class MySpringFirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/demo/applicationContext.xml");
		Customer customer= (Customer)context.getBean("cus");
		System.out.println("name:"+customer.getName());
		System.out.println("contact:"+customer.getContact());
		System.out.println("address:"+customer.getAddress());
	}

}
//it is an old model so we can't follow this model this way is also right but we can't follow  