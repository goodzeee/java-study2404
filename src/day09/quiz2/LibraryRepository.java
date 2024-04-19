package day09.quiz2;

// 역할 : 도서관리 앱에서 사용하는 데이터들을 모아 관리하는 객체
// 관리할 데이터 : 우리 회원 누구 ? 우리 어떤 책들을 갖고 있는지 ?
public class LibraryRepository {
    private static BookList bookList;   // 여러 책
    private static BookUser user;  // 회원 한 명 회원가입한 것만 관리 !

    // 정적 초기화 : static 필드 초기값 설정 !!
    static {
        //user = new BookUser();  // 사용자는 회원가입해야 저장되도록
        bookList = new BookList();  // 책 6개 저장해두기
        bookList.push(new CookBook("기적의 집밥책", "김해진", "청림라이프", true));
        bookList.push(new CartoonBook("떨어지면 끝장맨", "스에노부 케이코", "대원씨아이", 18));
        bookList.push(new CartoonBook("원펀맨", "One", "대원씨아이", 15));
        bookList.push(new CookBook("삐뽀삐뽀 119 이유식", "하정훈", "유니책방", false));
        bookList.push(new CookBook("오늘은 아무래도 덮밥", "이마이 료", "참돌", true));
        bookList.push(new CartoonBook("이세계로 전이했으니 치트를 살려 마법검사가 되기로 했다", "Shinkoshoto", "대원씨아이", 12));
    }

    LibraryRepository() {
    }

    public void addNewMember(Book newMember) {

    }

    // 저장소에 user 저장
    public void saveBookUser(BookUser bookUser) {
       user = bookUser;
    }

    // 책 정보가 들어 있는 배열을 리턴
    public Book[] getAllBooksInfo() {
        // 책 배열을 담고 있는 걸 다른 곳에서 가져와 협력
        return bookList.getbArr();
    }
}
