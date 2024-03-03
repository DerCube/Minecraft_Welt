public class MinecraftWelt {
    int spawnx;
    int spawny;
    int spielzeit;
    Spieler Udo;
    EndSiedlung endSiedlung;

    public MinecraftWelt(int spawnx, int spawny, int spielzeit, EndSiedlung endSiedlung, String name,double spieler_hp, Schwert schwert){
        this.spawnx = spawnx;
        this.spawny = spawny;
        this.spielzeit = spielzeit;
        this.endSiedlung = endSiedlung;
        this.Udo = new Spieler(name,spieler_hp,schwert);

    }
}
