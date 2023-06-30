package com.task6.greeting;

import java.time.LocalDateTime;

public class Time {
    private String message;

    private LocalDateTime nowTime;

    public Time(String message, LocalDateTime nowTime) {
        this.message = message;
        this.nowTime = nowTime;
    }

    public String getmessage() {

        return message;
    }

    public void setTimeStamp(String message) {

        this.message = message;
    }

    public LocalDateTime getNowTime() {

        return nowTime;
    }

    public void setNowTime(LocalDateTime nowTime) {

        this.nowTime = nowTime;
    }
}
