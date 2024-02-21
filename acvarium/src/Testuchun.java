import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Testuchun {
    public static void main(String[] args) {
        long aDay = TimeUnit.SECONDS.toSeconds(5);
        System.out.println("aDay---- " + aDay);
        long now = new Date().getTime() + aDay;
        System.out.println("now---- " + now);
        long now2 = TimeUnit.SECONDS.toSeconds(10);
        System.out.println("now---- " + now2);
        Date hundredYearsAgo = new Date(now - aDay * 365 * 100);
        Date tenDaysAgo = new Date(now - aDay * 10);
    }
}
