
public class Main {
    public static void main(String[] args) {
        // Create 5 monsters
        Monster dragon1 = new Dragon("Smaug", 500, 75, 50);
        Monster dragon2 = new Dragon("Toothless", 300, 50, 40);
        Monster vampire1 = new Vampire("Dracula", 350, 60, 5);
        Monster werewolf1 = new Werewolf("Fenrir", 250, 55, true);
        Monster vampire2 = new Vampire("Carmilla", 280, 45, 3);

        // Set special powers using setter methods
        dragon1.setSpecialPower(MonsterType.FIRE_BREATH);
        dragon2.setSpecialPower(MonsterType.FLIGHT);
        vampire1.setSpecialPower(MonsterType.SHAPE_SHIFTING);
        werewolf1.setSpecialPower(MonsterType.SUPER_STRENGTH);
        vampire2.setSpecialPower(MonsterType.MIND_CONTROL);

        // Print all monsters and their characteristics
        System.out.println("=== Monster Characteristics ===");
        System.out.println(dragon1);
        System.out.println("\n" + dragon2);
        System.out.println("\n" + vampire1);
        System.out.println("\n" + werewolf1);
        System.out.println("\n" + vampire2);

        // Print all monsters and their special powers
        System.out.println("\n=== Monster Special Powers ===");
        System.out.println(dragon1.getName() + ": " + dragon1.getSpecialPower().getPowerName());
        System.out.println(dragon2.getName() + ": " + dragon2.getSpecialPower().getPowerName());
        System.out.println(vampire1.getName() + ": " + vampire1.getSpecialPower().getPowerName());
        System.out.println(werewolf1.getName() + ": " + werewolf1.getSpecialPower().getPowerName());
        System.out.println(vampire2.getName() + ": " + vampire2.getSpecialPower().getPowerName());

        // Demonstrate special powers
        System.out.println("\n=== Monster Special Power Actions ===");
        dragon1.useSpecialPower();
        dragon2.useSpecialPower();
        vampire1.useSpecialPower();
        werewolf1.useSpecialPower();
        vampire2.useSpecialPower();
    }
}