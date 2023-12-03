public class Task4_15 {
    /*
    Известны год и номер месяца рождения человека, а также год и номер месяца
сегодняшнего дня (январь — 1 и т. д.). Определить возраст человека (число
полных лет). В случае совпадения указанных номеров месяцев считать, что
прошел полный год.
     */
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
