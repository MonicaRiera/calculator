package tech.bts.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    private SimpleCalculator calc = new SimpleCalculator(0);
    private int x;

    @Test
    public void sum(){
        calc.add(2);
        x = calc.getValue();

        assertThat(x, is(2));
    }

    @Test
    public void subtract() {
        calc.subtract(2);
        x = calc.getValue();

        assertThat(x, is(-2));
    }

    @Test
    public void multiply() {
        calc.multiply(4);
        x = calc.getValue();

        assertThat(x, is(0));
    }

    @Test
    public void divide() {
        calc.divide(2);
        x = calc.getValue();

        assertThat(x, is(0));
    }

    @Test
    public void multiple_operations() {
        calc.add(2);
        calc.add(1);
        calc.multiply(4);
        calc.subtract(3);
        calc.divide(2);
        x = calc.getValue();

        assertThat(x, is(4));
    }

    @Test (expected = CannotDivideByZeroException.class)
    public void divide_by_zero() {
        calc.divide(0);
    }

    @Test
    public void get_sign() {
        calc.subtract(2);
        x = calc.getSign();

        assertThat(x, is(-1));
    }

    @Test
    public void absolute() {
        calc.add(5);
        calc.subtract(8);
        x = calc.abs();

        assertThat(x, is(3));
    }

    @Test
    public void factorial() {
        calc.add(3);
        x = calc.factorial();

        assertThat(x, is(6));
    }

    @Test
    public void square() {
        calc.add(2);
        x = calc.square();

        assertThat(x, is(4));
    }

    @Test
    public void power() {
        calc.add(2);
        x = calc.power(10);

        assertThat(x, is(1024));
    }





}