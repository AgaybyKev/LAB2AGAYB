public enum MonsterType {
    FIRE_BREATH("Fire Breath"),
    TELEPORTATION("Teleportation"),
    INVISIBILITY("Invisibility"),
    SUPER_STRENGTH("Super Strength"),
    FLIGHT("Flight"),
    SHAPE_SHIFTING("Shape Shifting"),
    MIND_CONTROL("Mind Control"),
    REGENERATION("Regeneration");

    private final String powerName;

    MonsterType(String powerName) {
        this.powerName = powerName;
    }

    public String getPowerName() {
        return powerName;
    }
}