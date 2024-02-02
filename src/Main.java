public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Hero[] heroes = {new Magic(100, 20), new Medic(120, 15, 50),
                new Warrior(150, 25)};

        for (Hero hero : heroes) {
            hero.applySuperAbility();
        }
    }
}

