package day12.stream.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(
                List.of(
                        new Student("홍철수", 15, 79),
                        new Student("박영희", 17, 41),
                        new Student("손흥민", 11, 11),
                        new Student("감우성", 25, 34)
                )
        );
        
        // 나이 순으로 오름차 정렬
        // 정렬할 비교 기준 주기 -> getAge() 나이순
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {  // 제네릭 파라미터 사용 중
                return o1.getAge() - o2.getAge(); // 오름차 반대로 하면 내림차순
            }
        });
        System.out.println(studentList);

        // 성적 순으로 내림차 정렬
        // Comparator.comparing() -> 오름차 결과만 나오니 reversed() 해주기 !
        studentList.sort(Comparator.comparing((Student s) -> s.getScore()).reversed()); // reversed() 역순
        System.out.println(studentList);

        // 이름 순으로 오름차 정렬
        studentList.sort(Comparator.comparing((Student s) -> s.getName()).reversed());
        System.out.println(studentList);



    }
}
