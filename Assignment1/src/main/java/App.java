import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Swati Kholiya on 8/15/2017.
 */
public class App {

    public static void main(String[] args) {
        BeanFactory bf = new ClassPathXmlApplicationContext("app-context.xml");
        Hello helloBean = (Hello) bf.getBean("helloBean");
        System.out.println("Message = "+helloBean.getMessage());

    }

}
