import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Swati Kholiya on 8/15/2017.
 */
@Configuration
public class AppContext {

    @Bean(name="helloBean")
    public Hello helloWorld() {
        return new Hello();
    }

}