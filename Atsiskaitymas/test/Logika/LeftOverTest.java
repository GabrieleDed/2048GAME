/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logika;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gaded
 */
public class LeftOverTest {
    
    public LeftOverTest() {
    }

    
    @Test
    public void testAraktyvus() {
        LeftOver lower = new LeftOver();
        assert(lower.araktyvus(4) == 2);
    }
    @Test
    public void testAraktyvusAgain() {
        LeftOver lower = new LeftOver();
        assert(lower.araktyvus(8) == 2);
    }
    
}
