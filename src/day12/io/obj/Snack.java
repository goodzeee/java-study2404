package day12.io.obj;

import java.io.Serializable;
import java.util.Objects;

// Serializable : 객체를 입출력하기 위해 직렬화해주는 인터페이스 - (세이브 파일에 넣기 위해선 필요한 작업)
public class Snack implements Serializable {
    // 맛 열거형으로 만들기
    public enum Taste {
        GOOD, SOSO, BAD
    }
    // 스낵 필드
    private String snackName;
    private int year;
    private int price;
    private Taste taste;

    public Snack(String snackName, int year, int price, Taste taste) {
        this.snackName = snackName;
        this.year = year;
        this.price = price;
        this.taste = taste;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackName(String snackName) {
        this.snackName = snackName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "snackName='" + snackName + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", taste=" + taste +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snak = (Snack) o;
        return year == snak.year && price == snak.price && Objects.equals(snackName, snak.snackName) && taste == snak.taste;
    }

    @Override
    public int hashCode() {
        return Objects.hash(snackName, year, price, taste);
    }
}
