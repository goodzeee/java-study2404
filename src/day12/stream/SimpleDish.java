package day12.stream;

import java.util.Objects;

public class SimpleDish {

    private final String name;  // 요리이름과 칼로리만 추출하여 새로운 객체로 만들기 위한 클래스
    private final int calories;

    public SimpleDish(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    // 파라미터 Dish 클래스로 넣어버려서 알아서 파라미터 받아서 맞는 값 나오게 넣어주도록
    public SimpleDish(Dish dish) {
        this.name = dish.getName();
        this.calories = dish.getCalories();
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleDish that = (SimpleDish) o;
        return calories == that.calories && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, calories);
    }
}
