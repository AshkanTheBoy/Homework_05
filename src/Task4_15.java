public class Task4_15 {
    public static void main(String[] args) {
        int year = 2045;
        int month = 9;
        int yearNow = 2050;
        int monthNow = 10;
        int age;
        if (monthNow<month) {
            age = yearNow-year-1;
        } else {
            age = yearNow-year;
        }
        System.out.println("Возраст: "+age);
    }
}
