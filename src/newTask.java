abstract class footballClub {

    abstract void play();

}

class KarabakhFK extends footballClub {
    @Override
    void play() {
        System.out.println("Karabakh FK is a football club.");
    }
}

public class newTask {
    public static void main(String args[]) {
        footballClub fc = new KarabakhFK();
        fc.play();
    }
}
