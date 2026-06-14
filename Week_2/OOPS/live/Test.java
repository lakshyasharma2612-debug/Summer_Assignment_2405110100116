package Week_2.OOPS.live;


import Week_2.OOPS.music.string.Veena;
import Week_2.OOPS.music.Playable;
import Week_2.OOPS.music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        Veena veena = new Veena();
        veena.play();

        Saxophone saxophone = new Saxophone();
        saxophone.play();

        Playable p1 = new Veena();
        Playable p2 = new Saxophone();

        p1.play();
        p2.play();
    }
}
