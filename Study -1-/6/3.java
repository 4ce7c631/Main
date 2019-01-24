import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Есть две команды регби из 25-ти человек разного возраста каждая. Члены команды подбирались случайным образом.
        //Выведите на экран в двух отдельных строках возраст участников каждой команды. Посчитайте средний возраст каждой команды и сообщите,
        //для какой из них это значение оказалось больше (либо сообщите, что их средние арифметические равны).
        int [] team1 = array1();
        int [] team2 = array2();
        sum(team1, team2);
        double AverageForFirstTeam = result(team1);
        double AverageForSecondTeam = result(team2);
        compare(AverageForFirstTeam, AverageForSecondTeam);
    }

    //Ввод данных по первой команде
    static int[] array1() {
        Scanner scan = new Scanner(System.in);
        int [] array = new int[25];
        for (int i = 0; i < 25; i++) {
            System.out.println("Введите возраст " + (i + 1) + "го игрока первой команды");
            array[i] = scan.nextInt();
        }
        return array;
    }

    //Ввод данных по второй команде
    static int[] array2() {
        Scanner scan = new Scanner(System.in);
        int [] array = new int[25];
        for (int i = 0; i < 25; i++) {
            System.out.println("Введите возраст " + (i + 1) + "го игрока второй команды");
            array[i] = scan.nextInt();
        }
        return array;
    }

    //Вывод значений в терминале (очень длинно получилось - вообще без понятия, как делать проще (случаев не было))
    static void sum(int [] array1, int [] array2) {
        System.out.println("Возврат игроков первой команды:" + + array1[0] + " " + array1[1] + " " + array1[2] + " " + array1[3] + " " + array1[4] + " " + array1[5] + " " + array1[6] + " " + array1[7] + " " + array1[8] + " " + array1[9] + " " + array1[10] + " " + array1[11] + " " + array1[12] + " " + array1[13] + " " + array1[14] + " " + array1[15] + " " + array1[16] + " " + array1[17] + " " + array1[18] + " " + array1[19] + " " + array1[20] + " " + array1[21] + " " + array1[22] + " " + array1[23] + " " + array1[24]);
        System.out.println("Возвраст игроков второй команды: " + array2[0] + " " + array2[1] + " " + array2[2] + " " + array2[3] + " " + array2[4] + " " + array2[5] + " " + array2[6] + " " + array2[7] + " " + array2[8] + " " + array2[9] + " " + array2[10] + " " + array2[11] + " " + array2[12] + " " + array2[13] + " " + array2[14] + " " + array2[15] + " " + array2[16] + " " + array2[17] + " " + array2[18] + " " + array2[19] + " " + array2[20] + " " + array2[21] + " " + array2[22] + " " + array2[23] + " " + array2[24]);
    }

    //Операция срденей арифметической возраста команды
    static double result(int [] array) {
        double sum = 0;
        for (int i = 0; i < 25; i++) {
            sum = sum + array[i];
        }
        double average = sum / 25;
        return average;
    }

    //Функция сравнения
    static void compare(double a, double b) {
        if (a > b) {
            System.out.println("Первая команда старше второй в среднем на " + (a - b) + " лет");
        }
        else if (a < b) {
            System.out.println("Первая вторая старше первой в среднем на " + (b - a) + " лет");
        }
        else if (a == b) {
            System.out.println("Перваая и вторая команда в показателе среднего возвраста - равны");
        }
    }
}
