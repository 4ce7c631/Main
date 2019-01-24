import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Задан массив целых чисел. Поместить все нули в начало массива. Например дано {х,х,0,х,0,х}, в
        //результате получаем {0,0,х,х,х,х}, порядок ненулевых чисел значения не имеет.
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

    //Функция смещения данных
    static int[] swap(int[] array, int N) {
        int a = 0;
        int mem;
        for (int i = 0; i < N; i++) {
            if (array[i] == 0) {
                mem = array[i];
                array[i] = array[a];
                array[a] = mem;
                a++;
            }
        }
        return array;
    }

    //Функция выведения данных в терминале
    static void terminal(int[] array, int N) {
        for (int i = 0; i < N; i++) {
            System.out.println(" - " + array[i] + " - ");
        }
    }
}
