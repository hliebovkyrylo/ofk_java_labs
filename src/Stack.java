public class Stack {
  private final int maxSize;
  private int top;
  private final int[] stackArray;

  public Stack(int size) {
    maxSize = size;
    stackArray = new int[maxSize];
    top = -1;
  }

  public void push(int value) {
    if(top == maxSize - 1) {
      System.out.println("Стек повний. Неможливо додати елемент.");
    } else {
      stackArray[++top] = value;
    }
  }

  public int pop() {
    if(top == -1) {
      System.out.println("Стек порожній. Немає елементів для видалення.");
      return -1;
    } else {
      return stackArray[top--];
    }
  }

  public int peek() {
    if(top == -1) {
      System.out.println("Стек порожній. Немає елементів для перегляду.");
      return -1;
    } else {
      return stackArray[top];
    }
  }

  public boolean isEmpty() {
    return (top == -1);
  }

  public boolean isFull() {
    return (top == maxSize - 1);
  }

  public static void main(String[] args) {
    Stack stack = new Stack(3);
    System.out.println("Стек порожній: " + stack.isEmpty());
    stack.push(1);
    stack.push(2);
    stack.push(3);
    System.out.println("Стек повний: " + stack.isFull());
    System.out.println("Верхній елемент стека: " + stack.peek());
    System.out.println("Видалення елемента: " + stack.pop());
    System.out.println("Верхній елемент стека після видалення: " + stack.peek());
  }
}