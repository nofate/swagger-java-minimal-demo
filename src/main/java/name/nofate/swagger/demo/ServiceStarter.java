package name.nofate.swagger.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.ws.rs.Path;

public class ServiceStarter {
    public static void main(String[] args)  {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
    }
}
