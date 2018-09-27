package com.example.arkoz.weathertoday.Common;

import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;

public class common {
    public static final String APP_ID = "f5f9064bb255d37c9440fedf2fa3a6d1";
    public static Location current_location = null;

    public static String convertUnixToDate(long dt) {
        Date date = new Date(dt*1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm EEE dd MM yyyy");
        String formatted = simpleDateFormat.format(date);
        return formatted;
    }

    public static String convertUnixToHour(long dt) {
        Date date = new Date(dt*1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        String formatted = simpleDateFormat.format(date);
        return formatted;
    }
}
