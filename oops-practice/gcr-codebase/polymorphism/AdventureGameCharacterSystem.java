import java.util.Scanner;

class GameCharacter {
    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    void performAttack() {
        System.out.println(characterName + " attacks");
    }
}

class Warrior extends GameCharacter {
    Warrior(String characterName) {
        super(characterName);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with a Sword");
    }
}

class Mage extends GameCharacter {
    Mage(String characterName) {
        super(characterName);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with Magic");
    }
}

class Archer extends GameCharacter {
    Archer(String characterName) {
        super(characterName);
    }

    void performAttack() {
        System.out.println(characterName + " attacks with a Bow");
    }
}

public class AdventureGameCharacterSystem {

    static void startBattle(GameCharacter[] characters) {
        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;

        System.out.println("\nBattle Starts:\n");

        for (GameCharacter c : characters) {
            c.performAttack();

            if (c instanceof Warrior) {
                warriorCount++;
            } else if (c instanceof Mage) {
                mageCount++;
            } else if (c instanceof Archer) {
                archerCount++;
            }
        }

        System.out.println("\nParticipants:");
        System.out.println("Warriors = " + warriorCount);
        System.out.println("Mages = " + mageCount);
        System.out.println("Archers = " + archerCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Warrior Name: ");
        String warriorName = sc.nextLine();

        System.out.print("Enter Mage Name: ");
        String mageName = sc.nextLine();

        System.out.print("Enter Archer Name: ");
        String archerName = sc.nextLine();

        GameCharacter[] characters = new GameCharacter[3];
        characters[0] = new Warrior(warriorName);
        characters[1] = new Mage(mageName);
        characters[2] = new Archer(archerName);

        startBattle(characters);

        sc.close();
    }
}