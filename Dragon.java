public final class Dragon extends Monster {
    private int wingSpan; // in feet

    public Dragon(String name, int health, int attackPower, int wingSpan) {
        super(name, health, attackPower);
        this.wingSpan = wingSpan;
    }

    @Override
    public void useSpecialPower() {
        System.out.println(getName() + " uses " + getSpecialPower().getPowerName() + "! The sky burns with fire!");
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Dragon" + "\nWing Span: " + wingSpan + " feet";
    }
}