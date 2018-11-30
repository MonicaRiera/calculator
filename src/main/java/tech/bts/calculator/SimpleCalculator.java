package tech.bts.calculator;

public class SimpleCalculator {

    private int value;

    public SimpleCalculator(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void add(int num) {
        this.value += num;
    }

    public void subtract(int num) {
        this.value -= num;
    }

    public void multiply(int num) {
        this.value *= num;
    }

    public void divide(int num) {
        if (num == 0) {
            throw new CannotDivideByZeroException();
        }
        this.value /= num;
    }

    public int getSign() {
        if (this.value > 0) {
            return 1;
        } else if (this.value < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public void abs() {
        if (this.value < 0) {
            this.value *= -1;
        }
    }
    
    public void factorial() {
        for (int i = getValue()-1; i > 0; i--) {
            this.value *= i;
        }
    }

    public void square() {
        this.value *= this.value;
    }

    public void power(int num) {
        int power = getValue();
        for (int i = 1; i < num; i++) {
            this.value *= power;
        }
    }
}
