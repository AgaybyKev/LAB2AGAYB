public final class Vampire extends Monster {
    private int age; // in centuries

    public Vampire(String name, int health, int attackPower, int age) {
        super(name, health, attackPower);
        this.age = age;
    }

    @Override
    public void useSpecialPower() {
        System.out.println(getName() + " uses " + getSpecialPower().getPowerName() + "! The night grows darker...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + "\nType: Vampire" + "\nAge: " + age + " centuries";
    }
}
