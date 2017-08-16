import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Swati Kholiya on 8/15/2017.
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
        Hello helloBean1  = (Hello) ctx.getBean("message");
        helloBean1.setMessage("Contents of Hello's Prototype bean");
        System.out.println("bean 1 message = "+helloBean1.getMessage());

        Hello helloBean2  = (Hello) ctx.getBean("message");
        System.out.println("bean 2 message = "+helloBean2.getMessage());

    }

}
