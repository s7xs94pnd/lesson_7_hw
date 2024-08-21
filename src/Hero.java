public abstract class Hero implements  HavingSuperAbility {
    private String name;
    private int health;
    private int damage;
    private String typeSuperT;

    public Hero(int health, int damage, String typeSuperT,String
                name){
        this.name = name;
        this.health=health;
        this.damage=damage;
        this.typeSuperT=typeSuperT;
    }

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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeSuperT() {
        return typeSuperT;
    }

    public void setTypeSuperT(String typeSuperT) {
        this.typeSuperT = typeSuperT;
    }

    @Override
    public void applySuperAbility() {

    }
}
