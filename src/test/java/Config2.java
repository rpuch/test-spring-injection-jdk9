import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author rpuch
 */
@Configuration
public class Config2 {
    @Resource
    private Bean1 bean1;

    @Bean
    public Bean2 bean2() {
        return new Bean2(bean1);
    }
}
