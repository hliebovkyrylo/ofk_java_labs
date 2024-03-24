// оголошення класу Box
public class Box {
  // приватні поля класу які визначають ширину, висоту, глибину та об'єм коробки
  private final double width;
  private final double height;
  private final double depth;
  private double vol;

  // конструктор за замовчуванням, який створює коробку розміром 1x1x1
  public Box() {
    this(1, 1, 1);
  }

  // конструктор, який створює коробку з заданими шириною, висотою та глибиною
  public Box(double width, double height, double depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  // конструктор копіювання, який створює нову коробку, що є копією існуючої
  public Box(Box b) {
    this(b.width, b.height, b.depth);
    this.vol = b.vol;
  }

  // метод для обчислення об'єму коробки
  public double volume() {
    vol = this.width * this.height * this.depth;
    System.out.println("Об'єм дорівнює " + vol);
    return vol;
  }

  // метод для додавання заданої кількості значень до об'єму коробки
  public void sum(double... d) {
    System.out.println("Кількість аргументів:" + d.length);
    for (double x : d) {
      vol += x;
    }
    System.out.println("Сума дорівнює " + vol);
  }

  // головний метод програми
  public static void main(String[] args) {
    Box myBox1 = new Box(); // створення нової коробки за замовчуванням
    Box myBox2 = new Box(12,32,55); // створення нової коробки з заданими розмірами
    Box myBox3 = new Box(myBox1); // створення нової коробки, що є копією існуючої
    double volume1 = myBox1.volume(); // обчислення та виведення об'єму першої коробки
    double volume2 = myBox2.volume(); // обчислення та виведення об'єму другої коробки
    double volume3 = myBox3.volume(); // обчислення та виведення об'єму третьої коробки
    System.out.println("Об'єм коробки 1: " + volume1);
    System.out.println("Об'єм коробки 2: " + volume2);
    System.out.println("Об'єм коробки 3: " + volume3);
    myBox3.sum(2,2,2,2,2,2,2); // додавання значень до об'єму третьої коробки
  }
}
