
public abstract class Monster {
    private String name;
    private int health;
    private int attackPower;
    private MonsterType specialPower;

    public Monster(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // Abstract method to be implemented by child classes
    public abstract void useSpecialPower();

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public MonsterType getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(MonsterType specialPower) {
        this.specialPower = specialPower;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nHealth: " + health +
                "\nAttack Power: " + attackPower +
                "\nSpecial Power: " + specialPower.getPowerName();
    }
}