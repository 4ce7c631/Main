import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //2.	В вашей баскетбольной команде 10 человек. Очки игроков основного состава записаны в четные ячейки 
        // массива , а запасных игроков - в нечетных. Написать функцию, которая найдет насколько больше очков 
        // заработал основной состав по отношению к запасным игрокам.
        int[] array = Array();
        int a = sum1(array);
        int b = sum2(array);
        if (a > b) {
            System.out.println("Основная команда набрала на " + (a - b) + " больше очков чем резервная");
        }
        else if (a < b) {
            System.out.println("Резервная команда набрала на " + (b - a) + " больше очков чем основная");
        }
        else if (a == b) {
            System.out.println("Ничья");
        }
    }

    static int[] Array() {
        Scanner scan = new Scanner(System.in);
        int [] array = new int[20];
        //Ввод данных по основной команде
        System.out.println("Сейчас начнеться ввод очков основного состава");
        int Players = 1;
        for(int i = 1; i < 20; i = i + 2) {
            System.out.println("Введите колличество баллов " + (Players++) + " игрока");
            array[i] = scan.nextInt();
        }
        //Ввод данных по резервной команде
        Players = 1;
        System.out.println("Сейчас начнеться ввод очков резервного состава");
        for(int i = 0; i < 20; i = i + 2) {
            System.out.println("Введите колличество баллов " + (Players++) + " игрока");
            array[i] = scan.nextInt();
        }
        return array;
    }

    //Подсчет основной команды
    static int sum1(int[] array) {
        int sum = 0;
        for (int i = 1; i < 20; i = i + 2) {
            sum = sum + array[i];
        }
        return sum;
    }

    //Подсчет резервной команды
    static int sum2(int[] array) {
        int sum = 0;
        for (int i = 0; i < 20; i = i + 2) {
            sum = sum + array[i];
        }
        return sum;
    }
}
