public class Skelett extends Monster{
    boolean verwandelbar;
    public Skelett(double hp,String typ,double damage,boolean verwandelbar){
        super(hp,typ,damage);
        this.verwandelbar = verwandelbar;
        this.damage = damage;
    }

}