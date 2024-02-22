import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Testuchun {
    public static void main(String[] args) {
        long aDay = TimeUnit.DAYS.toDays(1);
        System.out.println("aDay---- " + aDay);
        long now = (new Date().getTime()) + TimeUnit.MINUTES.toMinutes(5);
        long xozirgivaqt =now -  (new Date().getTime());
        System.out.println("xozir vaqt: " + xozirgivaqt);
        System.out.println("xozirga---5 minut qo'shildi " + now);
        long now2 = TimeUnit.SECONDS.toSeconds(10);
        System.out.println("now2---- " + now2);
        Date hundredYearsAgo = new Date(now - aDay * 365 * 100);
        Date tenDaysAgo = new Date(now - aDay * 10);
    }
}
