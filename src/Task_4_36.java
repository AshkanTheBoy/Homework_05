public class Task_4_36 {
    public static void main(String[] args) {
        //случайная минута
        int t = (int)Math.round(Math.random()*60);
        //цикл 3-2-3-2 в сумме 10 - можем смотреть по десяткам
        int tt = (t%10);
        System.out.println(t+" "+tt);
        if (tt<3 || (tt>4 && tt<8)) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Красный");
        }
    }
}