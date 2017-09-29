import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rpuch
 */
@Configuration
public class Config1 {
    @Bean
    public Bean1 bean1() {
        return new Bean1();
    }
}
