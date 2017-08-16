import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Swati Kholiya on 8/15/2017.
 */
public class App {

    public static void main(String[] args) {

        ApplicationContext cxt = new AnnotationConfigApplicationContext(AppConfig.class);
        Hello helloBean = (Hello) cxt.getBean("helloBean");
        helloBean.setMessage("Contents of Hello's Singleton bean");
        System.out.println("Message = "+helloBean.getMessage());

        Hello helloBean1 = (Hello) cxt.getBean("helloBean");
        System.out.println("Message = "+helloBean1.getMessage());

    }

}
