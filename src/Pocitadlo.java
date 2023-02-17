public class Pocitadlo extends Thread {

    int cislo;

    public Pocitadlo(int cislo) {
        this.cislo = cislo;
    }
    public void run() {
        for (int i = 0; i <= cislo; i++) {
            System.out.println(i);
            Thread.yield();
        }
    }
}
