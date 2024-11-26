package com.group2.refocus;

public class Break {

    private int time;
    private String breakActivity;

    Break(int time, String breakActivity) {
        setTime(time);
        setBreakActivity(breakActivity);
    }

    public void setBreakActivity(String breakActivity) {
        this.breakActivity = breakActivity;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getBreakActivity() {
        return breakActivity;
    }

    public int getTime() {
        return time;
    }
}
