public abstract class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount=amount;
        this.currency=currency;
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return getClass() == money.getClass() && amount == money.amount;
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount,"USD");
    }

    public static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    String currency() {
        return currency;
    }

}
