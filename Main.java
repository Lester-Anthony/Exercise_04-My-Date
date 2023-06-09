public class Main {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2022, 9, 29);
        MyDate date2 = new MyDate(2022, 9, 28);
        MyDate date3 = new MyDate();
        MyDate date4 = new MyDate();
        MyDate date5 = new MyDate(2022, "SepTembEr", 29);
        MyDate date6 = new MyDate(2022, "sePtembeR", 28);

        System.out.println(date1.isBefore(date2)); // This should return false
        System.out.println(date2.isBefore(date1)); // This should return true
        System.out.println(date3.isBefore(date1)); // This should return true
        System.out.println(date3.isBefore(date4)); // This should return false
        System.out.println(date5.isBefore(date6)); // This should return false
        System.out.println(date6.isBefore(date5)); // This should return true
    }
}