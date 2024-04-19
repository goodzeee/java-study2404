package day09.quiz2;

// 역할 : 요리책 정보 1개를 가진 객체
public class CookBook extends Book {

    // 필드 쿠폰 추가 !
    private boolean coupon; // 요리학원 쿠폰유무

    public CookBook() {}

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public String info() {
        return String.format("# 분류: 요리책, %s, 쿠폰유무: %s", super.info(), this.coupon ? "있음" : "없음");
    }
}

