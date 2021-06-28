import java.util.Objects;

public class Task4 {
    public static void main(String[] args) {
        Fraction fr = new Fraction(10.22);
        System.out.println(fr);
    }
}

class Fraction
{
    private double Value;

    public Fraction(double value) {
        Value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return Double.compare(fraction.Value, Value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Value);
    }

    public double getValue() {
        return Value;
    }

    public void setValue(double value) {
        Value = value;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "Value=" + Value +
                '}';
    }
}
