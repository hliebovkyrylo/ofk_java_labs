// Клас HighArray реалізує масив цілих чисел з певними методами для роботи з ним
public class HighArray {
    // Поле a - це масив довгих цілих чисел (long)
    private final long[] a;
    // Поле nElems зберігає кількість заповнених елементів масиву
    private int nElems;

    // Конструктор класу, який ініціалізує масив заданого розміру max
    public HighArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    // Метод find шукає передане значення searchKey у масиві та повертає true, якщо воно знайдене
    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] == searchKey) {
                break;
            }
        }
        if (j == nElems) {
            return false;
        } else {
            return true;
        }
    }

    // Метод insert додає передане значення value у кінець масиву
    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    // Метод delete видаляє перше входження переданого значення value з масиву та повертає true, якщо воно було знайдене
    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if (value == a[j]) {
                break;
            }
        }
        if (j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems; k++) {
                a[k] = a[k + 1];
            }
            nElems--;
            return true;
        }
    }

    // Метод display виводить всі елементи масиву на консоль
    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.println(a[j] + " ");
        }
    }

    // Метод getMax повертає максимальне значення серед елементів масиву
    public long getMax() {
        // Перевіряємо, чи масив не порожній
        if (nElems == 0) {
            // Якщо масив порожній, повертаємо -1 (оскільки немає жодного елемента)
            return -1;
        } else {
            // Якщо масив не порожній, присвоюємо першому елементу масиву змінній max
            long max = a[0];

            // Перебираємо всі елементи масиву, починаючи з другого
            for (int j = 1; j < nElems; j++) {
                // Якщо поточний елемент більший за max
                if (a[j] > max) {
                    // Присвоюємо його значення змінній max
                    max = a[j];
                }
            }

            // Після перебору всіх елементів, max містить максимальне значення
            // Повертаємо це максимальне значення
            return max;
        }
    }

    // Метод main - точка входу в програму
    public static void main(String[] args) {
        // Створюємо об'єкт класу HighArray з максимальним розміром масиву 10
        HighArray arr = new HighArray(10);
        // Додаємо деякі значення в масив
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.insert(50);
        // Виводимо максимальне значення масиву на консоль
        System.out.println("Максимальне значення: " + arr.getMax());
    }
}

