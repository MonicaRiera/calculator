package tech.bts.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    /**Does your test class work? The initialisation for each test should be done in a @Before method, not the way you do it.
     * - It did work but, to change it to the correct way, how can I then call the calc variable? If it is inside a method it is
     * just local for that method. It does not work now.

     - Good thing to do CannotDivideByZeroException. I wonder, you already get an exception if you try to divide by zero, right? YES*/

    @Before
    public void initialize() {
        SimpleCalculator calc = new SimpleCalculator(0);
        int x;
    }

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