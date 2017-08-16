import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Swati Kholiya on 8/15/2017.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
        Hello helloBean  = (Hello) ctx.getBean("helloBean");
        helloBean.setMessage("Hello World!!!");
        System.out.println("Message = "+helloBean.getMessage());
    }
}
