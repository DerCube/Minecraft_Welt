public abstract class Monster {
    double hp;
    double damage;
    String typ;
    Waffe waffe;

    public Monster(double hp,String typ,double damage){
        this.hp=hp;
        this.typ=typ;
        this.damage=damage;
    }
    public void atribute_ausgeben(){
        System.out.println(damage + hp + typ);
    }
}
