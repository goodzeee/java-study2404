package day05;

public class ListMain {
    public static void main(String[] args) {
        //메인에서 클래스 StringList에 sArr 배열 불러와서 사용됨 !!
        StringList foods = new StringList(); //배열이 아닌 객체. 객체 안에 배열이 있는 것으로 foods.length라고 하면 안됨.
        StringList userNames = new StringList();

        //배열 내부 데이터 수 확인
        System.out.println(foods.sArr.length); //이렇게 해야 출력됨
        //System.out.println(userNames.size()); //또는 이렇게

        //배열에 데이터 추가
        foods.push("짬뽕");
        foods.push("짜장");

        userNames.push("영희");

        foods.push("탕수육");

        //자료 삭제
        //foods.remove(0);
        foods.remove("짬뽕");

        //자료 중간 삽입
        userNames.push("김철수");
        userNames.push("홍길동");
        userNames.insert(1, "뽀로로");
        foods.insert(1, "마라탕");

        //배열 데이터 수정
        foods.set(0,"김치볶음밥");
        userNames.set(1,"대길이");

        //배열 데이터 전체 삭제
        //foods.clear();//foods 내부가 전체 삭제되고 size가 0이 되어야 함

        //배열 데이터가 한개라도 있는지 확인
        boolean flag = foods.isEmpty();//배열이 비어있으면 true, 아니면 false
        System.out.println("flag = " + flag);

        //new StringList(); 해서 ctrl alt v
        System.out.println("foods = " + foods.toString());
        System.out.println("userNames = " + userNames.toString()); //빈 배열 출력됨

    }
}