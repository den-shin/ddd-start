package domain;

public class Money {
    private int value;

    Money(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public Money add(Money money) {
        return new Money(this.value + money.value);
    }

    Money multiply(int multiplier) {
        return new Money(value * multiplier);
    }
}
