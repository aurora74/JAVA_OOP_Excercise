public class Staff extends Person{

    private String school;

    private double pay;

    /**
     * abc xyz.
     * @param name abc
     * @param address abc
     * @param school abc
     * @param pay abc
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String newSchool) {
        this.school = newSchool;
    }

    public void setPay(double newPay) {
        this.pay = newPay;
    }

    public String toString() {
        return String.format("Staff[%s,school=%s,pay=%.1f]", super.toString(), school, pay);
    }
}
