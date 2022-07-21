public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int i = 1;
        while ( i <= 10) {
            System.out.print( i + " ");
            i++;
        }
        System.out.println();
        for ( int n =10; n > 0; n--) {
            System.out.print(n + " ");
        }
    }
    public static void task2() {
        int friday = 1;
        while (friday <= 31) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;
        }
    }
    public static void task3() {

        int year = 2022;
        int startYear = year - 200;
        int endYear = year + 100;
        for (int cometaYear = startYear;cometaYear <= endYear; cometaYear++){
            if (cometaYear % 79 == 0) {
                System.out.println(cometaYear);
            }
        }


    }
}