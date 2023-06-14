public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int deposit = 15_000;
        int months = 0;
        int sum = 0;
        while (sum <= 2_459_000) {
            months++;
            sum += deposit;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей%n", months, sum);
        }
        System.out.printf("Всего необходимо %d месяца или %.1f года%n", months, (months / 12f));
    }

    public static void task2() {
        System.out.println("Задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задание 3");
        int peoples = 12_000_000;
        int years = 0;
        while (years < 10) {
            int fertility = 17 * (peoples / 1000);
            int mortality = 8 * (peoples / 1000);
            years++;
            peoples += (fertility - mortality);
            System.out.printf("Год %d, численность населения составляет %d%n", years, peoples);
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        int deposit = 15_000;
        double percent = 7;
        double sum = 0;
        double target = 12_000_000;
        int months = 0;
        while (sum <= target) {
            months++;
            sum += deposit;
            sum += (sum * percent / 100);
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", months, sum);
        }
        System.out.printf("Всего необходимо %d месяцев или %.1f года%n", months, (months / 12f));
    }

    public static void task5() {
        System.out.println("Задание 5");
        int deposit = 15_000;
        double percent = 7;
        double sum = 0;
        double target = 12_000_000;
        int months = 0;
        while (sum <= target) {
            months++;
            sum += deposit;
            sum += (sum * percent / 1200);
            if (months % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", months, sum);
            }
        }
        System.out.printf("Всего необходимо %d месяцев или %.1f года%n", months, (months / 12f));
    }

    public static void task6() {
        System.out.println("Задание 6");
        int deposit = 15_000;
        double percent = 7;
        double sum = 0;
        int months = 0;
        while (months < 9 * 12) {
            months++;
            sum += deposit;
            sum += (sum * percent / 1200);
            if (months % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", months, sum);
            }
        }
        System.out.printf("Всего накоплено: %.2f%n", sum);
    }

    public static void task7() {
        System.out.println("Задание 7");
        for (int firstFriday = 4; firstFriday <= 31; firstFriday += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет%n", firstFriday);
        }
    }

    public static void task8() {
        System.out.println("Задание 8");
        int yearsToday = 2023;
        for (int years = yearsToday - 200; years <= yearsToday + 100; years++) {
            if (years % 79 == 0) {
                System.out.println(years);
            }
        }
    }
}