import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Инициализация массива чисел Фибоначчи
        int[] Number = new int[11];
        Number[0] = 1;
        Number[1] = 2;
        for (int i = 2; i < Number.length; i++) {
            Number[i] = Number[i - 1] + Number[i - 2];
        }

        // Массив для хранения результатов (0 или 1)
        int[] results = new int[Number.length];

        // Ввод числа
        System.out.print("Введите число в десятичной системе: ");
        Scanner scanner = new Scanner(System.in);
        int Chislo = scanner.nextInt();

        // Повторяем вычитание, пока число больше нуля
        while (Chislo > 0) {
            // Проходим по массиву чисел Фибоначчи с конца
            for (int i = Number.length - 1; i >= 0; i--) {
                if (Chislo >= Number[i]) {
                    results[i] = 1; // Отмечаем число, которое было вычтено
                    Chislo = Chislo - Number[i]; // Вычитаем это число
                    break; // Останавливаем цикл, чтобы начать заново с новым значением Chislo
                }
            }
        }

        System.out.print("Число в системе Фибоначчи: ");
        // Вывод результатов (замена всех чисел на 0 или 1)
        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i]);
        }
    }
}