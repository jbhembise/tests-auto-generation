package jbhembise.testauto.example1;

public class Calculator {

    private int result = 0;

    public Calculator() {}

    public Calculator(int initialValue) {
        this.result = initialValue;
    }

    public void clear() {
        this.result = 0;
    }

    public int getResult() {
        return result;
    }

    public void add(int n) {
        this.result += n;
    }

    public void substract(int n) {
        this.result -= n;
    }

    public void multiply(int n) {
        this.result *= n;
    }

    public void divide(int n) {
        this.result /= n;
    }

}
