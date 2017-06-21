package com.kitcenter.app.classwork.lesson17;


public enum Holiday {
    NEW_YEAR(1, "January", "New Year"), CHRISTMAS(7, "January", "Christmas"), EASTER(8, "April", "Easter");

    private int value;
    private String month;
    private String holiday;


    Holiday(int value, String month, String holiday) {
        this.value = value;
        this.month = month;
        this.holiday = holiday;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }
}
