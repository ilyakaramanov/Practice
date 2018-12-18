public class Practice1 {
    static byte byteB;
    static short shortS;
    static int intI;
    static long longL;
    static double doubleD;
    static float floatF;
    static char charC;
    static boolean booleanB;

    public static void main(String[] args) {

/*
        System.out.println(byteB);
        System.out.println(shortS);
        System.out.println(intI);
        System.out.println(longL);
        System.out.println(doubleD);
        System.out.println(floatF);
        System.out.println(charC);
        System.out.println(booleanB);
*/
        task10();


    }


    static void task2() {
        float f1 = 1.f;
        float f2 = 1;
        float f3 = 0x1;
        float f4 = 0b1;
        float f5 = 1.0e1f;
        float f6 = 01f;

    }

    static void task3() {
        short s1 = 1 + 1;
        short s2 = (short) (1 + 1.5);
        short s3 = (short) (1 + 11.22f);
        byte b = 21;
        short s4 = (short) (s3 + b);
        short s5 = (short) (1.0e1f + 22.11d);
    }

    static void task4() {
        int cat1 = 3;
        int cat2 = 4;
        int hyp = 5;
        System.out.println(((cat1 * cat1 + cat2 * cat2) == hyp * hyp) ? "Прямоугольный" : "Не прямоугольный");

    }

    static void task5() {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void task6() {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }


    static void task7() {
        int sum = 0;
        int a;
        int b;
        for (a = 2; a <= 20; a++) {
            b = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0)
                    b++;
            }
            if (b <= 2)
                sum = sum + a;
        }
        System.out.println(sum);
    }


    static void task8() {
        int a = 1;
        int b = 1;
        int c = 2;

        while (a + b == c) {
            System.out.println("true");
        }
        while (b + c == a) {
            System.out.println("true");
        }
        while (a + c == b) {
            System.out.println("true");
        }
    }

    static void task9() {
        int a = 50;
        int b = 45;
        int c = 0;
        if (a > b) {
            c = (a + b) / 2;
        }
        System.out.println(c);
    }

    static void task10() {

        int credit = 1000;
        double percent = 0.05;
        int month = 5;

        double a = credit / month;
        double b = credit / month * percent * month;
        double c = a * percent;
        System.out.println("Суммарное значение выплаченных процентов: " + b);
        System.out.println("Тело кредита: " + a + " проценты: " + c);

    }

}

