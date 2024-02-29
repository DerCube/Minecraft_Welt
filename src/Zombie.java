public class Zombie extends Monster{
    boolean agro;

    public Zombie(double hp,String typ,double damage,boolean agro){
        super(hp,typ,damage);
        this.agro = agro;
    }

}
