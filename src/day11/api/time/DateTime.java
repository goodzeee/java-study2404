package day11.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTime {

    public static void main(String[] args) {
// 날짜와 시간 관련 시스템

        // 자바8ver 이전 - Date, Calendar
        Date date = new Date();
        System.out.println("date = " + date.getYear());

        Calendar calendar = Calendar.getInstance();
        System.out.println(Calendar.YEAR);

        // 자바8ver 이후 - LocalDate, LocalTime ... Local 로컬 !!
        LocalDate nowDate = LocalDate.now();
        System.out.println("nowDate = " + nowDate); // 2024-04-23
        System.out.println(nowDate.getYear());   // 2024
        System.out.println(nowDate.getMonth());  // APRIL
        System.out.println(nowDate.getMonthValue());  // 4

        // 현재 시분초 LocalTime.now()
        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("nowDateTime = " + nowDateTime);

        // 특정 날짜 정보 생성하기 - LocalDate.of(년, 월, 일)
        LocalDate targetDate = LocalDate.of(2023, 1, 4);
        System.out.println("targetDate = " + targetDate);

        // 날짜 연산 - 도서 대여시스템 : 빌린 날짜로부터 5일 뒤 반납일 plusDays(증가 날)
        LocalDate rentalDate = LocalDate.now(); // 현재 날짜 now()
        LocalDate returnDate = rentalDate.plusDays(5);  // 현재 날짜에.plusDays 날짜 증가시키기
        System.out.println("returnDate = " + returnDate);

        LocalDate targetDateTime = returnDate
                .plusYears(2)
                .plusMonths(3)
                .plusDays(5);

        System.out.println("targetDateTime = " + targetDateTime);

        // 사이 날짜 구하기
        LocalDate hireDate = LocalDate.of(2018, 3, 6);
        LocalDate retireDate = LocalDate.of(2022, 12, 27);

        long between = ChronoUnit.DAYS.between(hireDate, retireDate);
        System.out.println("between = " + between);

        // 날짜 포맷 바꾸기
        System.out.println("nowDateTime = " + nowDateTime);

        DateTimeFormatter pattern   // 출력되는 패턴 짜주기
                = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초");

        String dateString = nowDateTime.format(pattern);
        System.out.println("dateString = " + dateString);



    }
}
