public class Warrior extends Hero{
    public Warrior(int health, int damage, String typeSuperT, String name) {
        super(health, damage, typeSuperT, name);
    }

    @Override
    public void applySuperAbility() {
        System.out.println(getName()+"Warrior применил супер способность  "+getTypeSuperT());
    }

}
