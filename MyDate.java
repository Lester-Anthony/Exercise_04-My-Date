public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
    }

    public MyDate(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
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
        switch (month.toLowerCase()) {
            case "january":
                this.month = 1;
            case "february":
                this.month = 2;
            case "march":
                this.month = 3;
            case "april":
                this.month = 4;
            case "may":
                this.month = 5;
            case "june":
                this.month = 6;
            case "july":
                this.month = 7;
            case "august":
                this.month = 8;
            case "september":
                this.month = 9;
            case "october":
                this.month = 10;
            case "november":
                this.month = 11;
            case "december":
                this.month = 12;
            default:
                System.out.println("ERROR: Invalid Month");
        }
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}