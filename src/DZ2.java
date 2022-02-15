public class DZ2 {
    public static void main(String[] args) {

        float i;
//        i = 10  километраж в первый день (км)
        System.out.println("Цикл for");
        for (i = 10; i < 18; i = i + (i * 10/100)) {
        System.out.println(i);
        }
        System.out.println("Цикл while");
        float a = 10;
        while (a < 18) {
            System.out.println(a);
            a = a + (a * 10/100);
        }
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


    }
}
