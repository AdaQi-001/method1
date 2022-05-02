import static org.junit.Assert.*;
import org.junit.*;

public class testMethod {
    @Test
    public void testAddOne(){
        assertEquals(1,Method.addOne(1)); //Expect to be failed
    }
}
