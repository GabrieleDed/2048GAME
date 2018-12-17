
package Logika;

import org.junit.Test;
import static org.junit.Assert.*;

public class AddNumbersTest {
    
    public AddNumbersTest() {
    }

    @Test
    public void testSumLargeNumbers() {
        AddNumbers num = new AddNumbers();
        assert(num.AddNumber(1024) == 2048);
    }
    @Test
    public void testAddNumber() {
        AddNumbers num = new AddNumbers();
        assert(num.AddNumber(4) == 8);
    }
    
}
