public class DZ2 {
    public static void main(String[] args) {
        System.out.println("--- Задача 1 ---");
/*      Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
        день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
        суммарный путь пробежит спортсмен за 7 дней?
*/

//        float i;
//        i = 10  километраж в первый день (км)
        System.out.println("Цикл for");
        for (float i = 10; i < 18; i = i + (i * 10/100)) {
        System.out.println(i);
        }
        System.out.println(" ");
        System.out.println("Цикл while");
        float a = 10;
        while (a < 18) {
            System.out.println(a);
            a = a + (a * 10/100);
        }
        System.out.println(" ");
        System.out.println("Цикл do while");

        float b = 10, // км в первый день
                c;
        int d = 0;
        do{
            d = ++d;
            System.out.print(d + " день - ");
            System.out.print(b);
            System.out.println(" км");
            c = b * 10/100; // 10% от предыдущего дня
            b = b + c;
        }
        while (d < 7);

        System.out.println(" ");
        System.out.println("--- Задача 2 ---");
/*      Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
        сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */
        System.out.println("Цикл for");
        int e = 1;
        System.out.println("час 1, количество амёб - 1");
        for (int i = 3; i < 25; i = i + 3) {

            System.out.print("час ");
            System.out.print(i);
            System.out.print(", количество амёб - ");
            e = e * 2;
            System.out.println(e);
        }

        System.out.println(" ");
        System.out.println("Цикл while");
        int i = 0, f; f = 1;
        while (i < 25) {
            System.out.print("час ");
            System.out.print(i);
            System.out.print(", количество амёб - ");
            i = i + 3;
            System.out.println(f);
            f = f * 2;
        }


    }
}
