public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        this.year = 1990;
        this.month = 1;
        this.day = 1;
    }

    public MyDate(int month, int day) {
        this.year = 2022;
        this.month = month;
        this.day = day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate(int year, String month, int day) {
        this.year = year;
        this.setMonth(month);
        this.day = day;
    }


    public boolean isBefore(MyDate date) {
        if (this.year < date.getYear())
            return true;
        else if (this.year == date.getYear() && this.month < date.getMonth())
            return true;
        else if (this.year == date.getYear() && this.month == date.getMonth() && this.day < date.getDay())
            return true;
        else
            return false;
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setMonth(String month) {
        this.month = parseMonth(month);
    }

    public int parseMonth(String month) {
        switch (month.toLowerCase()) {
            case "january":
                return 1;
            case "february":
                return 2;
            case "march":
                return 3;
            case "april":
                return 4;
            case "may":
                return 5;
            case "june":
                return 6;
            case "july":
                return 7;
            case "august":
                return 8;
            case "september":
                return 9;
            case "october":
                return 10;
            case "november":
                return 11;
            case "december":
                return 12;
            default:
                System.out.println("ERROR: Invalid Month");
                return 0;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}