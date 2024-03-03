public class Spieler {
    String name;
    double spieler_hp;
    Schwert schwert;
    Monster monster;
    EndSiedlung end;
    Wohnung basis;
    public Spieler(String name,double spieler_hp,Schwert schwert){
        this.name = name;
        this.spieler_hp = spieler_hp;
        this.schwert = schwert;
    }

}
