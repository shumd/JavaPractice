package FromTaskBook;

import java.text.DecimalFormat;

public class Time {
    private static final int SECONDS_IN_DAY = 86400;
    private static final int SECONDS_IN_HOUR = 3600;
    private static final int SECONDS_IN_MINUTE = 60;

    private int seconds;



    public Time(int hours, int minutes, int seconds){
        this(hours*SECONDS_IN_HOUR + minutes*SECONDS_IN_MINUTE + seconds);
    }

    public Time(int seconds){
        setSeconds(seconds);
    }

    public void setSeconds(int seconds) {
        if(seconds > SECONDS_IN_DAY){
            seconds %= SECONDS_IN_DAY;
        }

        this.seconds = seconds;
    }

    public int getSeconds(){
        return seconds - (getHours()*SECONDS_IN_HOUR + getMinutes()*SECONDS_IN_MINUTE);
    }

    public int getMinutes(){
        return (seconds % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
    }

    public int getHours(){
        return seconds / SECONDS_IN_HOUR;
    }


    @Override
    public String toString() {
        return getHours() + ":" + new DecimalFormat("00").format(getMinutes()) + ":" + new DecimalFormat("00").format(getSeconds());
    }
}
