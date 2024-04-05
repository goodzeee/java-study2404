import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(10 + 5);
        System.out.println("안녕 ?");

        int month = 4;
        int day = 10;
        String vote = "국회의원 선거날";

        System.out.println(month + "월 " + day + "일은 " + vote + "입니다."); //ln - line
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, vote); //f - \n 따로 줄바꿈
    }
}