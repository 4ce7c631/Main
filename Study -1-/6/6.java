import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Задан массив чисел. Создать другой массив, который будет
        //состоять только из неповторяющихся чисел заданного массива.
        Scanner scan = new Scanner(System.in);
        int N = inPut();
        int [] array = inPutArray(N);
        array = swap(array, N);
        terminal(array, N);
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

    //Функция создания нового массива
    static int[] swap(int[] array, int N) {
        int a;
        int[] newarray = new int[N];
        for (int i = 0; i < N; i++) {
            do {
                a = (int) (Math.random() * 99);
            } while (a == array[i]);
            newarray[i] = a;
        }
        return newarray;
    }

    //Функция выведения данных в терминале
    static void terminal(int[] array, int N) {
        for (int i = 0; i < N; i++) {
            System.out.println(" - " + array[i] + " - ");
        }
    }
}
