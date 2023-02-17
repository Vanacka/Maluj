public class Main extends Thread {

    public static void main(String[] args) {
        System.out.println("start");
        Pocitadlo p1 = new Pocitadlo(1500);
        Pocitadlo p2 = new Pocitadlo(1000);
        Pocitadlo p3 = new Pocitadlo(2000);
        Maluj m1 = new Maluj("Churaq", "pise");
        Maluj m2 = new Maluj("Chuj", "strika");
        //System.out.println("radek 42");
        p1.start();
        //System.out.println("OSS 355");
        p2.start();
        //System.out.println("hgfkdksjhgq");
        p3.start();
    }
}