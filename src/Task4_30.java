public class Task4_30 {
    public static void main(String[] args) {
        int a = 123;

        //a
        if (a%10+(a/10%10)+(a/100%10)>9) {
            System.out.println("Сумма двузначная");
        }
        //b
        if (a%10*(a/10%10)*(a/100%10)>99 && a%10*(a/10%10)*(a/100%10)<1000) {
            System.out.println("Произведение трехзначное");
        }
        //c
        int b = 3;
        if (a%10*(a/10%10)*(a/100%10)>b) {
            System.out.println("Произведение больше числа b");
        }
        //d
        if ((a%10+(a/10%10)+(a/100%10))%5==0) {
            System.out.println("Сумма кратна 5");
        }
        //e
        if ((a%10+(a/10%10)+(a/100%10))%b==0) {
            System.out.println("Сумма кратна числу b");
        }
    }
}