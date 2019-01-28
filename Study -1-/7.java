import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfObjective;
        System.out.println("Input number of objective");
        do {
            numberOfObjective = scan.nextInt();
            if (numberOfObjective < 0 || numberOfObjective > 7) {
                System.out.println("Wrong number");
            }
        } while (numberOfObjective < 0 || numberOfObjective > 7);
        switch (numberOfObjective) {
            case 1:
                objective1();
                break;
            case 2:
                objective2();
                break;
            case 3:
                objective3();
                break;
            case 4:
                objective4();
                break;
            case 5:
                objective5();
                break;
            case 6:
                objective6();
                break;
            case 7:
                objective7();
                break;
        }
    }

    //Есть число из 5и цифр в виде строки, введенное из консоли если менее или более 5и цифр, то выводим ошибку и просим ввести значение еще раз
    //Разобрать на отдельные числа и заполнить массив данными числами, в таком порядке как они представлены в строке.
    static void objective1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input value at most 5 digits");
        int length = 5;
        int sequence;
        do {
            sequence = scan.nextInt();
            if (sequence < 9999 || sequence > 100000) {
                System.out.println("Wrong number");
            }
        } while(sequence < 9999 || sequence > 100000);
        int[] separatedDigits = new int[length];
        for(int i = length - 1; i >= 0; --i) {
            int value = sequence % 10;
            separatedDigits[i] = value;
            sequence /= 10;
        }
        for (int x = 0; x < length; x++) {
            System.out.print(separatedDigits[x]);
        }
    }

    //В США нет 13ых этажей, а соответственно, когда строеться панель управления лифтом для указания пункта назначения,
    //то там должен отсутствовать данный номер, создать из сотни этажей, но числа 13 там представленно не должно быть
    //Колличество этажей здания выводиться из консоли.
    static void objective2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input all numbers of floors");
        int floorsNumber;
        int floor = 1;
        do {
            floorsNumber = scan.nextInt();
            if (floorsNumber < 0) {
                System.out.println("Wrong number");
            }
        } while(floorsNumber < 0);
        int[] floorsArray = new int[floorsNumber];
        for (int i = 0; i < (floorsNumber); i++) {
            if (floor < 13) {
                floorsArray[i] = floor++;
            }
            else {
                floorsArray[i] = floor++ + 1;
            }
        }
        for (int x = 0; x < (floorsArray.length); x++) {
            System.out.print(" " + floorsArray[x]);
        }
    }

    //Дан массив произвольных чисел в колличестве десять найти наименьшее и наибольшее значения и получить дельту
    static void objective3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input length of array");
        int length;
        do {
            length = scan.nextInt();
            if (length < 0) {
                System.out.println("Wrong number");
            }
        } while (length < 0);
        int[] array = new int[length];
        int lowerNumber = 2147483647;
        int higherNumber = -2147483648;
        for (int i = 0; i < (length - 1); i++) {
            array[i] = (int) (Math.random() * 10000);
            if (array[i] < lowerNumber) {
                lowerNumber = array[i];
            }
            if (array[i] > higherNumber) {
                higherNumber = array[i];
            }
        }
        System.out.println("The lower number i: " + lowerNumber);
        System.out.println("The higher number is " + higherNumber);
        System.out.println("Delta is " + (higherNumber - lowerNumber));
    }

    //Создать двумерную матрицу (5х5) в виде массива, в которой значения будут равны 0, кроме главной диагонали.
    //По главной диагонали должны быть цифры соответствующие номеру ряда.
    //Выведенная матрица в консоле должна выглядеть следующим образом:
    // 1 0 0 0 0
    // 0 2 0 0 0
    // 0 0 3 0 0
    // 0 0 0 4 0
    // 0 0 0 0 5
    static void objective4() {
        int[][] a = new int[5][5];

        for(int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a.length; ++j) {
                if (i == j) {
                    System.out.print(a[i][j] + i + 1);
                } else {
                    System.out.print(a[i][j]);
                }
            }

            System.out.print("\n");
        }
    }

    //Создать двумерную матрицу (5х5) в виде массива, в которой значения будут равны 0, кроме прямоугольного треугольника.
    //Выведенная матрица в консоле должна выглядеть следующим образом:
    // 1 0 0 0 0
    // 1 2 0 0 0
    // 1 2 3 0 0
    // 1 2 3 4 0
    // 1 2 3 4 5
    static void objective5() {
        int[][] a = new int[5][5];
        for(int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a.length; ++j) {
                if (i >= j) {
                    System.out.print(a[i][j] + j + 1);
                } else {
                    System.out.print(a[i][j]);
                }
            }
            System.out.print("\n");
        }
    }
    // Дан массив неизвестной величины. Пользователь вводит произвольное количество значений, последовательно по одному.
    // Массив должен быть проинициализирован значениями в том порядке, что вводил пользователь
    // Например:
    // a.	Ввод числа 1
    // Создан массив {1}
    // b.	Ввод числа -11
    // Создан массив {1, -11}
    // c.	Ввод числа 73
    // Создан массива {1, -11, 73}
    // На выходе массив {1, -11, 73}

    static void objective6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number. Each time after this number will be a check");
        int check;
        do {
            check = scan.nextInt();
            if (check <= 0) {
                System.out.println("Wrong number");
            }
        }  while(check <= 0);
        int[] array = new int[999];
        int i = 0;
        int stopWord = 0;
        int presentlyCheck = check;
        System.out.println("Input random numbers");
        do {
            array[i] = scan.nextInt();
            i++;
            presentlyCheck--;
            if (presentlyCheck <= 0) {
                System.out.println("Input 1 if you want to stop");
                stopWord = scan.nextInt();
                presentlyCheck = check;
            }
        } while (stopWord != 1);
        for (int j = 0; j < (i); j++) {
            System.out.print(array[j]);
        }
    }

    // Поездной состав Мюнхен-Варшава. Диспетчеру предлагается автоматически скомплектовать состав по количеству вагонов
    // в диапазоне от 5 до 20. Каждый вагон имеет свой уникальный номер от 1 до 30. В каждом вагоне 5 мест.
    // Занятое место равно 1, свободное - 2. Скомплектовать поездной состав
    //
    // Пример одного вагона в составе, где А есть первый вагон состава, В - номер вагона, С - места свободные и занятые
    //
    // [
    //	A => [
    //		B => 19
    //		C => [
    //			0 => 1
    //			1 => 0
    //			2 => 0
    //			3 => 1
    //			4 => 1
    //		]
    //	]
    // ]
    static void objective7() {
        Scanner scan = new Scanner(System.in);
        int quantityTrainComposition;
        System.out.println("Input quantity of train composition (5-25)");
        do {
            quantityTrainComposition = scan.nextInt();
            if (quantityTrainComposition < 5 || quantityTrainComposition > 25) {
                System.out.println("Wrong number");
            }
        } while (quantityTrainComposition < 5 || quantityTrainComposition > 25);
        int[][] array = new int[quantityTrainComposition][6];
        for (int i = 0; i < quantityTrainComposition; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == 0) {
                    System.out.println("Input number of train");
                    do {
                        array[i][j] = scan.nextInt();
                        if (array[i][j] < 1 || array[i][j] > 30) {
                            System.out.println("Wrong number");
                        }
                    } while(array[i][j] < 1 || array[i][j] > 30);
                } else {
                    do {
                        System.out.println("Input if " + j + "# seat is taken (1), or free (0) ");
                        array[i][j] = scan.nextInt();
                        if (array[i][j] < 0 || array[i][j] > 1) {
                            System.out.println("Wrong number");
                        }
                    } while (array[i][j] < 0 || array[i][j] > 1);
                }
            }
        }
        System.out.println("===============================================================================================================");
        for (int i = 0; i < quantityTrainComposition; i++) {
            System.out.println((i + 1) + " train");
            for (int j = 0; j < 6; j++) {
                if (j == 0) {
                    System.out.println("Number of train: " + array[i][j]);
                } else {
                    System.out.println(j + " seat: " + array[i][j]);
                }
            }
            System.out.println("===============================================================================================================");
        }
    }
}
