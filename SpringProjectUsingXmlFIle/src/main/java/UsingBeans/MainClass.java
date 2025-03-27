package UsingBeans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/demo/appConfig.xml");
		Student student=(Student)con.getBean("stud");  
	    student.display();  
	}

}
