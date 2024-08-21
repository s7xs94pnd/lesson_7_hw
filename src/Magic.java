public class Magic extends Hero{
    public Magic(int health, int damage, String typeSuperT, String name) {
        super(health, damage, typeSuperT, name);
    }

    @Override
    public void applySuperAbility() {
        System.out.println(getName()+"Magic применил супер способность "+getTypeSuperT());
    }
}
