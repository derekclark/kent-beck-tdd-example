public class Money {
    protected int amount;

    public boolean equals(Object object){
        Money money = (Money) object;
        return getClass() == money.getClass() && amount == money.amount;
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public static Franc franc(int amount) {
        return new Franc(amount);
    }
}
