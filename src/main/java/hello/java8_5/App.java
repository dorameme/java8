package hello.java8_5;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {

    public static void main(String[] args) {
        Date date = new Date(); //->가변성(mutable)이라 멀티스레드 환경에서 안전하지 않다.
        Calendar birth = new GregorianCalendar(1997, Calendar.APRIL,18);
        //신뢰도가 떨어진다 타입안정성이 떨어짐
        Date time = birth.getTime();
        //기준시 GMT
        Instant instant= Instant.now();
        System.out.println(instant);
        ZoneId zone = ZoneId.systemDefault();
        instant.atZone(zone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //Duration
        //Period
    }
}
