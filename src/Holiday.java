public class Holiday {
    private String holidayname;
    private String month;
    private int day;
    private boolean nationalholi;

    public Holiday(String holidayname, boolean nationalholi) {
        this.holidayname = holidayname;
        this.nationalholi = nationalholi;
    }

    public Holiday(String holidayname, String month, int day, boolean nationalholi) {
        this.holidayname = holidayname;
        this.month = month;
        this.day = day;
        this.nationalholi = nationalholi;
    }
    //holiday name getter
    public String getHolidayname() {
        return holidayname;
    }

    public void setHolidayname(String holidayname) {
        this.holidayname = holidayname;
    }
    //month getter
    public String getMonth() {
        return month;
    }
    //month setter
    public void setMonth(String month) {
        this.month = month;
    }
    //day getter
    public int getDay() {
        return day;
    }
    //day setter
    public void setDay(int day) {
        this.day = day;
    }
    //boolean
    public boolean isNationalholi() {
        return nationalholi;
    }

    public void setNationalholi(boolean nationalholi) {
        this.nationalholi = nationalholi;
    }
    //empty constructor
    public Holiday() {

    }
}




