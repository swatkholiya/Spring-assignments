import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Swati Kholiya on 8/15/2017.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        Hello msg = (Hello) context.getBean("message");
        System.out.println("Message = "+msg.getMessage());

    }

}
