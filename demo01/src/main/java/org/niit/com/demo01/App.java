package org.niit.com.demo01;

import org.niit.com.service.InfoService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext aac = new ClassPathXmlApplicationContext("services.xml");
    
        InfoService info = aac.getBean("is",InfoService.class);
        
        info.sayHello();
    
    }
}
