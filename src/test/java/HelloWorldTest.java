import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by ascheman on 11.06.16.
 */
public class HelloWorldTest {
    @Test
    public void testGreeting () {
        assertEquals ("Hello World", HelloWorld.GREETING);
    }
}
