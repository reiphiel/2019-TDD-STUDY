package money;

import java.util.Objects;

public class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
