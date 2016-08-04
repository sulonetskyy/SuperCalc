package com.ul.supercalc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ul on 04/08/16.
 */
public class SuperCalcTest {

    private SuperCalc superCalc = new SuperCalc();

    @Test
    public void testPlus() throws Exception {
        assertEquals(4, superCalc.plus(2, 2));
    }

}