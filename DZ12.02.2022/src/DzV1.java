public class DzV1 {
    public static void main(String[] args) {

        int a, b;
        a = 0;
        b = a;
        if (a < 0)
        {
            // Если "a" менше ноля то...
            System.out.println("это число отрицательное");
        }
        else if (a == 0)
        {
            // Если "а" равно нулю...
            System.out.println("это число ноль");
        }
        else
        {
            // Если "а" больше ноля...
            System.out.println("это число положитлеьное");
        }
        if ( -9 <= b && b <= 9 )
        {
            System.out.println(" однозначное ");
        }
        else if ( -99 <= b && b <= -10 )
        {
            System.out.println(" двузначное ");
        }
        else if ( b >= 10 && b <= 99 )
        {
            System.out.println(" двузначное ");
        }
        else if ( -999 <= b && b <= -100 )
        {
            System.out.println(" трехзначное ");
        }
        else if ( b >= 100 && b <= 999 )
        {
            System.out.println(" трехзначное ");
        }

         System.out.println("Программа закончена");


    }

}
