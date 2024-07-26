import java.time.YearMonth;

public class ArrayTest1 {
    public static void main(String[] args) {
        int year = 2024; // 원하는 연도를 설정합니다.

        for (int month = 1; month <= 12; month++) {
            YearMonth yearMonth = YearMonth.of(year, month);
            int lastDay = yearMonth.lengthOfMonth();
            System.out.println(year + "년 " + month + "월의 마지막 날은: " + lastDay + "일");
        }
    }
}
