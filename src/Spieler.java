public class Spieler {
    String name;
    double spieler_hp;
    Waffe Schwert;
    Monster monster;
    EndSiedlung end;
    Wohnung basis;
    public Spieler(String name,double spieler_hp, Waffe Schwert){
        this.name = name;
        this.spieler_hp = spieler_hp;
        this.Schwert = Schwert;
    }

}
