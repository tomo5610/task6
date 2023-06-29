package com.task6.greeting;

import java.time.LocalDateTime;

public class Time {
    private String timeStamp;

    private LocalDateTime nowTime;

    public Time(String timeStamp, LocalDateTime nowTime) {
        this.timeStamp = timeStamp;
        this.nowTime = nowTime;
    }

    public String getTimeStamp() {

        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {

        this.timeStamp = timeStamp;
    }

    public LocalDateTime getNowTime() {

        return nowTime;
    }

    public void setNowTime(LocalDateTime nowTime) {

        this.nowTime = nowTime;
    }
}
