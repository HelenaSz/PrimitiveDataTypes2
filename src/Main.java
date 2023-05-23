public class Main {
    public static void main(String[] args) {
        int account = 100;
        int refill = 2000;
        int percent = 1;

        if (refill < 1000) {
            System.out.println("Бонусы не начислены: " + (refill + account));
        }

        if (refill >= 1000) {
            System.out.println("Бонусы начислены в размере 1 процента за каждые 100 руб: "
                    + (account + refill + (refill * percent / 100)));
        }
    }
}



