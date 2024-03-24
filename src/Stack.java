// оголошення класу Stack
public class Stack {
  // приватні поля класу, які визначають максимальний розмір стека, верхній елемент, та масив для зберігання елементів стека
  private final int maxSize;
  private int top;
  private final int[] stackArray;

  // конструктор класу Stack, який приймає розмір стека
  public Stack(int size) {
    maxSize = size; // ініціалізація поля maxSize
    stackArray = new int[maxSize]; // створення нового масиву для зберігання елементів стека
    top = -1; // ініціалізація поля top значенням -1, що вказує на порожній стек
  }

  // метод для додавання елемента в стек
  public void push(int value) {
    if(top == maxSize - 1) { // перевірка, чи стек повний
      System.out.println("Стек повний. Неможливо додати елемент.");
    } else {
      stackArray[++top] = value; // додавання елемента в стек
    }
  }

  // метод для видалення елемента зі стека
  public int pop() {
    if(top == -1) { // перевірка чи стек порожній
      System.out.println("Стек порожній. Немає елементів для видалення.");
      return -1;
    } else {
      return stackArray[top--]; // Видалення елемента зі стека
    }
  }

  // метод для перегляду верхнього елемента стека
  public int peek() {
    if(top == -1) { // перевірка чи стек порожній
      System.out.println("Стек порожній. Немає елементів для перегляду.");
      return -1;
    } else {
      return stackArray[top]; // повернення верхнього елемента стека
    }
  }

  // метод для перевірки, чи стек порожній
  public boolean isEmpty() {
    return (top == -1);
  }

  // метод для перевірки чи стек повний
  public boolean isFull() {
    return (top == maxSize - 1);
  }

  // головний метод програми
  public static void main(String[] args) {
    Stack stack = new Stack(3); // створення нового об'єкта Stack
    System.out.println("Стек порожній: " + stack.isEmpty()); // перевірка чи стек порожній
    stack.push(1); // Додавання елементів в стек
    stack.push(2);
    stack.push(3);
    System.out.println("Стек повний: " + stack.isFull()); // перевірка, чи стек повний
    System.out.println("Верхній елемент стека: " + stack.peek()); // перегляд верхнього елемента стека
    System.out.println("Видалення елемента: " + stack.pop()); // видалення елемента зі стека
    System.out.println("Верхній елемент стека після видалення: " + stack.peek()); // перегляд верхнього елемента стека після видалення
  }
}
