public class Task3 {
    public static void main(String[] args) {

        Money account = new Money(10.45);
        System.out.println(account);

        account.Change(5.45);
        System.out.println(account);

        account.Change(-2.45);
        System.out.println(account);
    }
}

class Money
{
    private int IntPart;
    private int FloatPart;

    public Money(double Number) {
        IntPart = (int)Number;
        FloatPart = (int)((Number - (double)IntPart) * 100.0);
    }

    @Override
    public String toString() {
        return Integer.toString(IntPart) + "."+ Integer.toString(FloatPart);
    }

    public void Change(double Number){

        double tmp = Double.parseDouble(toString());
        tmp += Number;
        IntPart = (int)tmp;
        FloatPart = (int)((tmp - (double)IntPart) * 100.0);
    }
}