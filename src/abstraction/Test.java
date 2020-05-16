package abstraction;

public class Test {
    public static void main(String[] args) {
        MobileUser mu;//referece variable.//

        mu = new Rahim();
        mu.call();
        mu.sendMessage();

        mu = new Karim();
        mu.sendMessage();

        System.out.println("Jay");
    }
}
