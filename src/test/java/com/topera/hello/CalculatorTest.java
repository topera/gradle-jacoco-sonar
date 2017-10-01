package com.topera.hello;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void callSum() throws Exception {
        Assert.assertEquals("Testing the sum", 2, new Calculator().callSum(1, 1));
    }

}