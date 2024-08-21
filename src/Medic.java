public class Medic extends Hero{
    private int healPoints;
    public Medic(int health, int damage, String typeSuperT, String name,int healPoints) {
        super(health, damage, typeSuperT, name);
        this.healPoints=healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExperience() {
            this.healPoints += this.healPoints * 0.1;
        System.out.println("Heal was increased 10% : "+this.healPoints);
    }
    @Override
    public void applySuperAbility() {
        System.out.println(getName()+"Medic применил супер способность  "+getTypeSuperT());
    }
}
