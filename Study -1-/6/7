import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Дана последовательность целых чисел. Узнать является ли она строго возрастающей.
        // Строго возрастающая последовательность означает, что каждое следующее число больше предыдущего.
        int N = inPut();
        int [] array = inPutArray(N);
        if (sequence(array, N)) {
            System.out.println("Массив строго возрастающий");
        }
        else {
            System.out.println("Массив не строго возрастающий");
        }
    }

    //Функция введения данных
    static  int inPut() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int N;
        do {
            N = scan.nextInt();
            if (N <= 0) {
                System.out.println("Введено неправильное число");
            }
        } while ( N < 0 );
        return N;
    }

    //Функция введения данных
    static int[] inPutArray(int N) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Введите число под номером " + (i + 1));
            array[i] = scan.nextInt();
        }
        return array;
    }

    static boolean sequence(int[] array, int N) {
        for (int i = 1; i < N; i++) {
            if (array[i - 1] >= array[i]) {
                return false;
            }
        }
        return true;
    }

}
