package spring1;

import java.nio.file.FileSystem;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class shape {
public static void main(String[] args) {
	
//BeanFactory bf= new XmlBeanFactory(new FileSystemResource("bean.xml"));
	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
      triangle tg=(triangle)context.getBean("suni");
      tg.draw();
}
}
