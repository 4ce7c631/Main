import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Дана последовательность целых чисел. Необходимо найти ее самую длинную строго
        // возрастающую подпоследовательность. Например дано {10,2,3,5,2,3,3,5}. Ответ будет {2,3,5}
        int N = inPut();
        int [] array = inPutArray(N);
        sequence(array, N);
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

    //Функция последовательности и выведения в терминале
    static void sequence(int[] array, int N) {
        int range = 0;
        int truerange = 0;
        int[] newarray = new int[N];
        for (int i = 1; i < N; i++) {
            if (array[i - 1] < array[i]) {
                range++;
            }
            else if (array[i - 1] >= array[i] && range > truerange) {
                truerange = range;
                int numberofsequence = i - range - 1;
                for (int x = 0; x <= truerange; x++) {
                    newarray[x] = array[numberofsequence];
                    numberofsequence++;
                }
                range = 0;
            }
            else if (array[i - 1] >= array[i]) {
                range = 0;
            }
        }
        for (int y = 0; y < (truerange + 1); y++) {
            System.out.println(newarray[y]);
        }
    }
}
