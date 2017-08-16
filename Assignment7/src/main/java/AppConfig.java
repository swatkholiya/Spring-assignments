/**
 * Created by Swati Kholiya on 8/15/2017.
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name="helloBean")
    public Hello helloWorld() {
        return new Hello();
    }

}
