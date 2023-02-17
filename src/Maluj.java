public class Maluj extends Thread {

    String slovo;

    public Maluj(String jmeno, String slovo) {
        super(jmeno);
        this.slovo = slovo;
    }

    public void run() {
        for(char ch : slovo.toCharArray()) {
            System.out.println("Malir " + getName() + " napsal " + ch);
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                return;
            }
        }
    }
}
