import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Swati Kholiya on 8/15/2017.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");

        Hello msg  = (Hello)ctx.getBean("message");
        System.out.println("Message = "+msg.getMessage());
        msg.setMessage("Meesage changed!!!");

        Hello msg1  = (Hello)ctx.getBean("message");
        System.out.println("Message = "+msg1.getMessage());
    }

}
