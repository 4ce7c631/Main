import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1.	В убийстве Кеннеди есть 10 подозреваемых. Для каждого подозреваемого установлена вероятность того, 
        // что он был убийцей. Все эти вероятности записаны в виде массива чисел. Написать функцию, которая и определит 
        // номер подозреваемого, которого надо посадить в тюрьму.
        int array[] = Array();
        int Prisoner = WhoAreGoingToJail(array);
        System.out.println("Убийца скорее всего под номером " + (Prisoner + 1));

    }

    static int[] Array() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите колличество подозреваемых");
        int length = scan.nextInt();
        int [] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите вероятность того, что человек под номером " + (i + 1) + " являеться убийцей" );
            do {
                array[i] = scan.nextInt();
            } while (array[i] < 1 || array[i] > 100);
        }
        return array;
    }

    static int WhoAreGoingToJail(int[] array) {
        int Percent = 0;
        int Prisoner = 0;
        for (int i = 0; i < array.length; i++) {
            if (isLessThan(Percent, array[i])) {
                Percent = array[i];
                Prisoner = i;
            }
        }
        return Prisoner;
    }

    static boolean isLessThan(int a, int b) {
        return a < b;
    }
}
