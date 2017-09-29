/**
 * @author rpuch
 */
public class Bean2 {
    public Bean2(Bean1 bean1) {
        if (bean1 == null) {
            throw new IllegalStateException("bean1 is not injected");
        }
    }
}
