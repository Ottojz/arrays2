public class Main {
    public static void main(String[] args) {

        System.out.println();
        //task 1
        System.out.println("task 1");
        System.out.println();

        int [] spendingPerWeek = new int [5];
        spendingPerWeek [0] = 1_892_341;
        spendingPerWeek [1] = 1_456_341;
        spendingPerWeek [2] = 2_823_323;
        spendingPerWeek [3] = 1_142_412;
        spendingPerWeek [4] = 992_392;
        int spendingPerMonth = 0;

        for (int i = 0; i < spendingPerWeek.length; i++) {
            spendingPerMonth += spendingPerWeek [i];
            if (i == spendingPerWeek.length - 1) {
                System.out.println("Сумма трат за месяц составила " + spendingPerMonth + " рублей");
            }
        }

        System.out.println();
        //task 2
        System.out.println("task 2");
        System.out.println();
//Массив решил взять из предыдущего задания

        int maxSpending = 0;
        int minSpending = 2_147_483_647;

        for (final int max : spendingPerWeek) {
            if (max > maxSpending) {
                maxSpending = max;
            }
        }

        for (final int min : spendingPerWeek) {
            if (min < minSpending) {
                minSpending = min;
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minSpending + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxSpending + " рублей.");

        System.out.println();
        //task 3
        System.out.println("task 3");
        System.out.println();
//Массив решил взять из первого задания

        spendingPerMonth = 0;

        for (int i = 0; i < spendingPerWeek.length; i++) {
            spendingPerMonth += spendingPerWeek [i];
            if (i == spendingPerWeek.length - 1) {
                float averageSpending = (float) spendingPerMonth / (float) spendingPerWeek.length;
                System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей");
            }
        }

        System.out.println();
        //task 4
        System.out.println("task 4");
        System.out.println();

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
            System.out.print(reverseFullName [i]);
        }
        System.out.println();
    }
}