public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[]mes= HeroesCreate();
        for (HavingSuperAbility wAll:mes){
            wAll.applySuperAbility();
            if(wAll instanceof Medic){
                ((Medic) wAll).increaseExperience();
            }
        }
    }


    public static HavingSuperAbility[] HeroesCreate(){
        Magic Magic1 = new Magic(100,7,"Fire ball","wizard" );
        Medic Medic1 = new Medic(100,0,"Super Heal","med",20);
        Warrior Warrior1 = new Warrior(100,7,"super punch","Huga" );
        return new HavingSuperAbility[]{Magic1,Medic1,Warrior1};
    }

}