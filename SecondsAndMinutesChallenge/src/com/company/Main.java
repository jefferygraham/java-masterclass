package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid valid";

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }
    
    public static String getDurationString(int minutes, int seconds) {
        if(minutes >=0 && (seconds >= 0 && seconds <=50)) {
            int hours = minutes / 60;
            int leftOverMinutes = minutes % 60;

            String hoursString = hours + "h ";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }

            String minuteStrings = leftOverMinutes + "m ";
            if (leftOverMinutes < 10) {
                minuteStrings = "0" + minuteStrings;
            }

            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }
            return hoursString + minuteStrings + secondsString;
        } else  {
            return INVALID_VALUE_MESSAGE;
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int leftOverSeconds = seconds % 60;
            return getDurationString(minutes, leftOverSeconds);
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }
}
