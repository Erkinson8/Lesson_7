public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, int healPoints) {
        super(health, damage, "HEALING POWER");
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность HEALING POWER");
        increaseExperience();
    }


    public void increaseExperience() {
        healPoints += healPoints * 0.1;
        System.out.println("Опыт лечения увеличен. Теперь healPoints = " + healPoints);
    }
}
