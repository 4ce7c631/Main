import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfObjective;
        System.out.println("Input number of objective");
        do {
            numberOfObjective = scan.nextInt();
            if (numberOfObjective < 0 || numberOfObjective > 5) {
                System.out.println("Wrong number");
            }
        } while (numberOfObjective < 0 || numberOfObjective > 5);
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
        }
    }

    // В тюрьме для особо опасных преступников каждому заключенному присваивается номер.
    // Каждый номер рассчитывается на основе таблицы символов Unicode, в которой каждому символу
    // соответствует число. Посчитать сумму чисел своего имени и фамилии, заданных одной строкой
    // через пробел (например, “Джон Диллинджер”). Данная сумма и будет номером заключенного
        static void objective1() {
        Scanner scan = new Scanner(System.in);
            System.out.println("Input name of prisoner");
            String name = scan.next();
            System.out.println("Input surname of prisoner");
            String surname = scan.next();
            char[] dataName = name.toCharArray();
            char[] dataSurname = surname.toCharArray();
            int nameCode = 0;
            int surnameCode = 0;
            for (int i = 0; i < dataName.length; i++) {
                int a = dataName[i];
                nameCode += a;
            }
            for (int j = 0; j < dataSurname.length; j++) {
                int b = dataSurname[j];
                surnameCode += b;
            }
            System.out.println(nameCode + surnameCode);
        }

        // У вас в компании работает 103 существа. Все они записаны у вас в виде массива с
        // обозначением М (мужчина), Ж (женщина), В (вампир), О (оборотень).
        // Напишите функцию, которая считает кого у вас больше.
        static void objective2() {
        Scanner scan = new Scanner(System.in);
        int length;
        int maleSum = 0;
        int femaleSum = 0;
        int vampireSum = 0;
        int werewolfSum = 0;
        char M = 'M';
        char F = 'F';
        char V = 'V';
        char W = 'W';
            System.out.println("Input number of array");
        do {
            length = scan.nextInt();
            if (length < 0) {
                System.out.println("Wrong number");
            }
        } while(length < 0);
        char[] creaturesArray = new char[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Input sex or race of " + (i + 1) + "# creation (M - male, F - female, V - vampire, W - werewolf)");
            do {
                creaturesArray[i] = scan.next().charAt(0);
                if (creaturesArray[i] != M && creaturesArray[i] != F && creaturesArray[i] != V && creaturesArray[i] != W) {
                    System.out.println("Wrong letter");
                }
            } while (creaturesArray[i] != M && creaturesArray[i] != F && creaturesArray[i] != V && creaturesArray[i] != W);
            if (creaturesArray[i] == M) {
                maleSum++;
            }
            else if (creaturesArray[i] == F) {
                femaleSum++;
            }
            else if (creaturesArray[i] == V) {
                vampireSum++;
            }
            else if (creaturesArray[i] == W) {
                werewolfSum++;
            }
        }
        if (maleSum > femaleSum && maleSum > vampireSum || maleSum > werewolfSum) {
            System.out.println("Male creatures are major  - " + maleSum);
            System.out.println("Female - " + femaleSum);
            System.out.println("Vampires - " + vampireSum);
            System.out.println("Werewolfes - " + werewolfSum);
        }
        else if (femaleSum > maleSum && femaleSum > vampireSum && femaleSum > werewolfSum) {
            System.out.println("Female creatures are major - " + femaleSum);
            System.out.println("Male - " + maleSum);
            System.out.println("Vampires - " + vampireSum);
            System.out.println("Werewolfes - " + werewolfSum);
        }
        else if (vampireSum > maleSum && vampireSum > femaleSum && vampireSum > werewolfSum) {
            System.out.println("Vampire creatures are major - " + vampireSum);
            System.out.println("Male - " + maleSum);
            System.out.println("Female - " + femaleSum);
            System.out.println("Werewolfes - " + werewolfSum);
        }
        else if (werewolfSum > maleSum && werewolfSum > femaleSum && werewolfSum > vampireSum) {
            System.out.println("Werewolf creatures are major - " + werewolfSum);
            System.out.println("Male - " + maleSum);
            System.out.println("Female - " + femaleSum);
            System.out.println("Vampires - " + vampireSum);
        }
        else {
            System.out.println("Male - " + maleSum);
            System.out.println("Female - " + femaleSum);
            System.out.println("Vampires - " + vampireSum);
            System.out.println("Werewolfes - " + werewolfSum);
        }
    }

    //  Создать программу, которая запрашивает у пользователя произвольную строку символов.
    //  Далее программа ее шифрует и выводит на экран в зашифрованном виде.
    //  Шифрование происходит путем замены каждого символа символом, который находится на 5 позиций правее
    //  в предопределенной таблице шифрования. Таблица шифрования задается программистом в виде одномерного
    //  массива символов. Если при выборе символа для шифровки таблица шифрования заканчивается,
    //  то циклически переходить к ее началу.
    //	Например: Таблица шифрования (а,б,в,г,д,о,1,2,3,4,5,6,7,-,0)
    //	Исходная строка, которую ввел пользователь: год-2017
    //	Зашифрованная строка, которую выдала программа: 354г7д6в
    static void objective3() {
        Scanner scan = new Scanner(System.in);
        char cypherArray[] = library();
        System.out.println("Input character string for encryption with out spaces (example: software_shit )");
        String inPutData = scan.next();
        char[] data = inPutData.toCharArray();
        char[] encryptedData = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < cypherArray.length; j++) {
                if (data[i] == cypherArray[j]) {
                    int heap = j;
                    for (int x = 5; x > 0; x--) {
                        if (heap >= cypherArray.length) {
                            heap = 0;
                        }
                        heap++;
                    }
                    encryptedData[i] = cypherArray[heap];
                }
            }
        }
        System.out.println(encryptedData);
    }

    //  Создать генератор паролей, который будет генерировать случайные неповторяющиеся пароли по следующим правилам:
    //-	Пароль состоит из 8 символов
    //-	В пароле допускаются только латинские большие и маленькие буквы, цифры и символ подчеркивания
    //-	Пароль обязательно должен содержать Большие и маленькие буквы и цифры
    static void objective4() {
        char[] genArray = library();
        char[] password = new char[8];
        boolean trueNumber;
        boolean trueSmallChar;
        boolean trueBigChar;
        do {
            for (int i = 0; i < 8; i++){
                password[i] = genArray[(int) (Math.random() * genArray.length)];
            }
            trueNumber = false;
            trueBigChar = false;
            trueSmallChar = false;
            for (int j = 0; j < password.length; j++) {
                for (int y = 0; y < 26; y++) {
                    if (password[j] == genArray[y]) {
                        trueBigChar = true;
                    }
                }
                for (int u = 26; u < 52; u++) {
                    if (password[j] == genArray[u]) {
                        trueSmallChar = true;
                    }
                }
                for (int o = 52; o < 62; o++) {
                    if (password[j] == genArray[o]) {
                        trueNumber = true;
                    }
                }
            }
        } while (!trueNumber || !trueBigChar || !trueSmallChar);
        System.out.println(password);
    }

    // Задан массив строк из римских цифр от 1 до 10 включительно вида {I, II, III, IV, V, VI, VII, VIII, IX, X}.
    // Привести его к массиву байтов, затем привести массив байтов к массиву строк но уже арабских цифр
    static void objective5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input length of array");
        int length;
        do {
            length = scan.nextInt();
            if (length < 0) {
                System.out.println("Wrong number");
            }
        } while (length < 0);
        byte[] exchangeArray = new byte[length];
        String inPut;
        for (int i = 0; i < length; i++) {
            System.out.println("Input the roman number from 1 to 10 #" + (i + 1));
            do {
                inPut = scan.next();
                if (!check(inPut)) {
                    System.out.println("Wrong character");
                }
            } while (!check(inPut));
            exchangeArray[i] = exchange(inPut);
        }
        for (int i = 0; i < length; i++) {
            System.out.print(" " + exchangeArray[i]);
        }

    }

    static public char[] library() {
       char libArray[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0','-','_'};
       return libArray;
    }

    static public boolean check(String a) {
        String I = "I";
        String II = "II";
        String III = "III";
        String IV = "IV";
        String V = "V";
        String VI = "VI";
        String VII = "VII";
        String VIII = "VIII";
        String IX = "IX";
        String X = "X";
        if (a.equals(I)) {
            return true;
        }
        if (a.equals(II)) {
            return true;
        }
        if (a.equals(III)) {
            return true;
        }
        if (a.equals(IV)) {
            return true;
        }
        if (a.equals(V)) {
            return true;
        }
        if (a.equals(VI)) {
            return true;
        }
        if (a.equals(VII)) {
            return true;
        }
        if (a.equals(VIII)) {
            return true;
        }
        if (a.equals(IX)) {
            return true;
        }
        if (a.equals(X)) {
            return true;
        }
        return false;
    }

    static public byte exchange(String a) {
        String I = "I";
        String II = "II";
        String III = "III";
        String IV = "IV";
        String V = "V";
        String VI = "VI";
        String VII = "VII";
        String VIII = "VIII";
        String IX = "IX";
        if (a.equals(I)) {
            return 1;
        } if (a.equals(II)) {
            return 2;
        } if (a.equals(III)) {
            return 3;
        } if (a.equals(IV)) {
            return 4;
        } if (a.equals(V)) {
            return 5;
        } if (a.equals(VI)) {
            return 6;
        } if (a.equals(VII)) {
            return 7;
        } if (a.equals(VIII)) {
            return 8;
        } if (a.equals(IX)) {
            return 9;
        } else {
            return 10;
        }
    }
}
