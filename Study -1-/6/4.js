import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //4.	У вас есть 50 специальных программ для кибератак. Они пронумерованы от 1 до 50.
        // Атакуя сайт китайской разведки вы хотите каждый раз запускать программы в случайном порядке,
        // чтобы противник не смог заранее подготовиться. Напишите функцию, которая будет создавать массив с
        // номерами запускаемых программ. Номера в массиве не должны повторяться и должны расставляться
        // каждый раз в случайном порядке.
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите колличество эксплоитов");
        int N = scan.nextInt();
        int[] array = inPut(N);
        array = Switch(array, N);
        Terminal(array, N);
        System.out.println((int) (Math.random() * N));

    }

    //Функция заполнения
    static int[] inPut(int N) {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    //Функция перемешивания
    static int[] Switch(int[] array, int N) {
        for ( int i = 0; i < N; i++) {
            int j =  (int) (Math.random() * N);
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        return array;
    }

    //Функция вывода в терминале
    static void Terminal(int[] array, int N) {
        for (int i = 0; i < N; i++)
        System.out.println(array[i]);
    }
}
