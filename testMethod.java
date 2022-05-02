import static org.junit.Assert.*;
import org.junit.*;

public class testMethod {
    @Test
    public void testAddOne(){
        assertEquals(2,Method.addOne(1)); //Expect to be failed
    }
}
