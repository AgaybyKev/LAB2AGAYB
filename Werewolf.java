public final class Werewolf extends Monster {
    private boolean isTransformed;

    public Werewolf(String name, int health, int attackPower, boolean isTransformed) {
        super(name, health, attackPower);
        this.isTransformed = isTransformed;
    }

    @Override
    public void useSpecialPower() {
        System.out.println(getName() + " uses " + getSpecialPower().getPowerName() + "! The full moon shines bright!");
    }

    public boolean isTransformed() {
        return isTransformed;
    }

    public void setTransformed(boolean transformed) {
        isTransformed = transformed;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Werewolf" + "\nTransformed: " + isTransformed;
    }
}
