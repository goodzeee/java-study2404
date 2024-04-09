package day02;

public class ArraySearch {
    public static void main(String[] args) {

        String[] foods = {"족발", "딤섬", "훠궈", "삼겹살"};

        String target = "훠궈";

        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])) {
                index = i;
                break;
            }
        }
        System.out.println("index = " + index);
    }
}
