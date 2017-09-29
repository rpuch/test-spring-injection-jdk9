import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author rpuch
 */
public class MainTest {
    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config1.class, Config2.class);
        context.getBean(Bean2.class);
        System.out.println("OK");
    }
}
