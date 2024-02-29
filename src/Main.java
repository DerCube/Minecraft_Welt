import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){

        //Deklaration

        //Spieler
        Schwert schwert=new Schwert("DieLangeSchlange", 0.1, "Schong");
        Wohnung Atomschutzbunker=new Wohnung(69,420, "Koppenhagen");

        //Dimensionen
        MinecraftWelt minecraftWelt=new MinecraftWelt(4324,54554,3,new EndSiedlung(123,454,false),"Kleine_Kaka_Welt", 3,schwert);



        //Spawn Wohnung Distance
        double distanc_Wohung_zum_Spawn = Math.sqrt(Math.pow((Atomschutzbunker.posy - minecraftWelt.spawny),2) + Math.pow((Atomschutzbunker.posx - minecraftWelt.spawnx),2));
        System.out.println("die Wohnung ist " + distanc_Wohung_zum_Spawn + " Blöcke fom Spawn entfernt.");

        int anzahl_Monster = 5; // wie sill hier die Anzahl bestimmt werden?

        //End_Generierung();
        //kampf();
        BattleRoyal(anzahl_Monster);
    }//end of main

    public static void BattleRoyal(int anzahl_Monster){
        //Variablen Initialisieren


        //Objekte
        Creeper creeper=new Creeper(40,"Creeper",120,1);
        GeladernerCreeper geladenerBoy=new GeladernerCreeper(40,"GeladenerCreeper",200,1);
        Skelett skelett=new Skelett(30,"Skelett",5,false);
        Skelett_Reitter skelett_ritter=new Skelett_Reitter(100,"Skelett Ritter",1,true);
        Zombie zombie=new Zombie(20,"Zombie",0.5,true);
        Schwert schwert=new Schwert("DieLangeSchlange",2, "Schong");
        Spieler spieler=new Spieler("Udo",20,schwert);

        String[] Monster_name = {"creeper","Geladener Creeper","Skelett","Skelett Reiter","Zombie","Udo"};
        double[] hp={creeper.hp,};
        int[] damage=new int[anzahl_Monster];

        hp[1] =creeper.hp;

        //Werte Vergabe
        while ((creeper.hp + geladenerBoy.hp + skelett.hp + skelett_ritter.hp + zombie.hp) > 0) {
        //Instanz Variablen
        int random1 = (int)(Math.random() * ((anzahl_Monster + 1) - 1) + 1);
        int random2 = (int)(Math.random() * ((anzahl_Monster + 1) - 1) + 1);

            System.out.println(random1);
        //System.out.println(random1);

        }
    }//End of Monster
    public static void End_Generierung(){

        //Objekte
        EndSiedlung[] endSiedlung = new EndSiedlung[3];
        endSiedlung[0]=new EndSiedlung(9233423, 56289238, false);
        endSiedlung[1]=new EndSiedlung(729, 0, true);
        endSiedlung[2]=new EndSiedlung(67953, 43554, false);
        //Eingaben
        String[] eingabe = {"In der einen Endsiedlung suchen","In der anderen Endsiedlung suchen","oder der anderen anderen"};
        var siedlung =JOptionPane.showOptionDialog(null, "In welcher End Siedlung willst du nach Elytren suchen?",
                "Guten Morgen, Diese Nachricht wird Ihnen Präsentiert von deiner Mutter, ich hoffe sie haben einen angenehmen aufenthalt in unserem Eingabefeld.",0,2,null,eingabe,eingabe[0]);

        //Ausgabe
        if (siedlung == 0) {
            if (!endSiedlung[siedlung].elytra) {
                System.out.println("Gibt hier Keine Elytra hier Sorry");
            } else {
                System.out.println("Eine Elytra Gefunden!!!");
            }
        }
        if (siedlung == 1) {
            if (!endSiedlung[siedlung].elytra) {
                System.out.println("Gibt hier Keine Elytra hier Sorry");
            } else {
                System.out.println("Eine Elytra Gefunden!!!");
            }
        }
        if (siedlung == 2) {
            if (!endSiedlung[siedlung].elytra) {
                System.out.println("Gibt hier Keine Elytra hier Sorry");
            } else {
                System.out.println("Eine Elytra Gefunden!!!");
            }
        }
    }//End of End_Generierung

    public static void kampf(){
        //Objekte
        Creeper creeper=new Creeper(40,"Creeper",120,1);
        Skelett skelett=new Skelett(30,"Skelett",5,false);
        GeladernerCreeper geladenerBoy=new GeladernerCreeper(40,"GeladenerCreeper",200,1);
        Schwert schwert=new Schwert("DieLangeSchlange",2, "Schong");
        Spieler spieler=new Spieler("Udo",20,schwert);
        Zombie zombie=new Zombie(20,"Zombie",0.5,true);
        Skelett_Reitter skelett_ritter=new Skelett_Reitter(100,"Skelett Ritter",1,true);

        double s_hp = spieler.spieler_hp;
        double s_damage = schwert.damage;
        double m_hp=1;
        double m_damage=1;

        //Eingabe
        String[] eingabe = {"Zombie","Skelett","Skelett Ritter","Creeper","Geladener Creeper"};
        var monster =JOptionPane.showOptionDialog(null, "Gegen welches Monster soll der Spieler Kämpfen?",
        "Guten Morgen, Diese Nachricht wird Ihnen Präsentiert von deiner Mutter, ich hoffe sie haben einen angenehmen aufenthalt in unserem Eingabefeld.",
                0,2,null,eingabe,eingabe[0]);

        String run=JOptionPane.showInputDialog("Wie oft soll Angegriffen werden?");
        int runden=Integer.parseInt(run);

        //vergeben der Werte für die Monster.
        if (monster == 3) {
            m_hp = creeper.hp;
            m_damage = creeper.damage;
            System.out.println("Der Kampf gegen denn Creeper hat begonnen.");
        }
        if (monster == 1) {
            m_hp = skelett.hp;
            m_damage = skelett.damage;
            System.out.println("Der Kampf gegen das Skelett hat begonnen.");
        }
        if (monster == 4) {
            m_hp = geladenerBoy.hp;
            m_damage = geladenerBoy.damage;
            System.out.println("Der Kampf gegen den Geladenen Creeper hat begonnen.");
        }
        if (monster == 0) {
            m_hp = zombie.hp;
            m_damage = zombie.damage;
            System.out.println("Der Kampf gegen den Zombie hat begonnen.");
        }
        if (monster == 2) {
            m_hp = skelett_ritter.hp;
            m_damage = skelett_ritter.damage;
            System.out.println("Der Kampf gegen den Skelett Reitter hat begonnen.");
        }

        //Kampf
        int K_runde=0;
        for (int i = 0; i < runden; i++) {
            K_runde = K_runde + 1;//Runden Counter

            if (s_hp>0) { //Angriff spieler
                m_hp = m_hp - s_damage;
            }//end of Angriff Spieler

            if (m_hp>0) { //Angriff Monster
                s_hp = s_hp - m_damage;
            }//end of Angriff Monster

            System.out.println("Runde: " + K_runde + " der Spieler hat noch " + s_hp + " hp und das Monster noch " + m_hp + " hp.");
        }//end of for

        //Ergebnisse ausgaben
        if (s_hp<0) {
            System.out.print("Der Spieler wurde von " + eingabe[monster] + " getötet.");
        }
        if (m_hp<0) {
            System.out.print("Der Spieler hat " + eingabe[monster] + " getötet.");
        }
        if (m_hp>0 && s_hp>0) {
            System.out.print("Beide Leben noch. der Spieler hat " + (s_hp - spieler.spieler_hp) + " an Leben verloren und das Monster hat noch "+ (m_hp) + " Leben.");
        }
    }//end of kampf
}//end of all