package com.kitcenter.runners.classwork.lesson17;


import com.kitcenter.app.classwork.lesson17.Holiday;

public class HolidayRunner {
    public static void main(String[] args) {
        for(Holiday holiday: Holiday.values()){
            System.out.println(holiday.getHoliday() + " holiday is on " + holiday.getMonth() + ", " + holiday.getValue());
        }
    }
}
