package FromTaskBook.Properties;

import FromTaskBook.Time;
import lombok.Getter;
import lombok.ToString;

import java.text.DecimalFormat;

@Getter
public class Date {
    private final int hour;
    private final int minutes;

    public Date(int hour, int minute){
        Time time = new Time(hour,minute,0);
        this.hour = time.getHours();
        this.minutes = time.getMinutes();
    }

    @Override
    public String toString() {
        return new DecimalFormat("00").format(hour) + ":" +
                new DecimalFormat("00").format(minutes);
    }
}
