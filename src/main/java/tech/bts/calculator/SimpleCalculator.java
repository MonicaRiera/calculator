package tech.bts.calculator;

public class SimpleCalculator {

    private int value;

    public SimpleCalculator(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int add(int num) {
        this.value += num;
        return this.value;
    }

    public int subtract(int num) {
        this.value -= num;
        return this.value;
    }

    public int multiply(int num) {
        this.value *= num;
        return this.value;
    }

    public int divide(int num) {
        if (num == 0) {
            throw new CannotDivideByZeroException();
        }
        this.value /= num;
        return this.value;
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

    public int abs() {
        if (this.value < 0) {
            this.value *= -1;
        }

        return this.value;
    }
    
    public int factorial() {
        for (int i = getValue()-1; i > 0; i--) {
            this.value *= i;
        }
        return this.value;
    }

    public int square() {
        return this.value*this.value;
    }

    public int power(int num) {
        int power = getValue();
        for (int i = 1; i < num; i++) {
            this.value *= power;
        }

        return this.value;
    }
}
