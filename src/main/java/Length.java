package main.java;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 8/7/12
 * Time: 7:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Length {
    private int number;
    private Unit unit;

    public Length(int number, Unit unit) {
        this.number = number;
        this.unit = unit;
    }

    public int getNumber() {
        return number;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object object) {
        Length length = (Length) object;

        Length l1 = this.transfer_mm();
        Length l2 = length.transfer_mm();

        if (l1.getNumber() == l2.getNumber() && l1.getUnit().equals(l2.getUnit())) {
            return true;
        }
        return false;
    }

    public Length transfer_mm() {
        return new Length(number * unit.getRatio(), Unit.MM);
    }
}
