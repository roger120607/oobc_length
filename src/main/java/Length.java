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

    private String unit;

    public Length(int number, String unit) {
        this.number = number;
        this.unit = unit;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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
        if (this.getUnit().equals("m")) {
            return new Length(getNumber() * 1000, "mm");
        }

        if (this.getUnit().equals("cm")) {
            return new Length(getNumber() * 10, "mm");
        }

        if(this.getUnit().equals("mm")){
            return this;

        }

        return null;
    }
}
