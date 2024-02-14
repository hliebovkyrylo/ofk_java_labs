import java.util.Random;

public class CoinFlip {
  public static void main(String[] args) {
    Random rand = new Random();

    boolean coin = rand.nextBoolean();

    if (coin) {
      System.out.println("Герб");
    } else {
      System.out.println("Число");
    }
  }
}