package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert720RblThen12Dlr() {
        int in = 720;
        int expected = 12;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}