public class Box {
  private final double width;
  private final double height;
  private final double depth;

  public Box(double width, double height, double depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  public double volume() {
    return this.width * this.height * this.depth;
  }

  public static double Volume(Box b) {
    return b.width * b.height * b.depth;
  }

  public static void main(String[] args) {
    Box box = new Box(3, 2, 6);
    System.out.println("Об'єм коробки: " + box.volume());
    System.out.println("Об'єм коробки (через статичний метод): " + Box.Volume(box));
  }
}