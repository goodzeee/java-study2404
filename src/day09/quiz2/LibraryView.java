package day09.quiz2;

import day03.member.Gender;
import day05.StringList;
import util.SimpleInput;

// 역할 : 도서관리 프로그램에서 입출력을 담당하는 객체
public class LibraryView {
    LibraryView lv;
    private LibraryRepository lr;
    static SimpleInput si;

    public LibraryView() {
        //this.lv = new LibraryView();
        this.lr = new LibraryRepository();
        this.si = new SimpleInput();
    }

    public static void strat() {
        showProgramMenu();
    }

    // 회원 정보를 입력받는 기능
    public void makeNewBookUser() {
        System.out.println("# 회원 정보를 입력해주세요.");
        String name = si.input("# 이름 : ");
        int age = Integer.parseInt(si.input("# 나이 : "));
        Gender gender = inputGender();

        // 입력된 데이터를 저장시켜야 함. => repository 역할
        lr.saveBookUser(new BookUser(name, age, gender, 0));

//        if (gender.equals("M")) {
//            gender = Gender.MALE.getGender();
//        } else if (gender.equals("F")) {
//            gender = Gender.FEMALE.getGender();
//        } else {
//            System.out.println("성별을 잘못 입력했습니다.");
//            si.input("# 성별(M/F) : ");
//        }
//        // LibraryView newMember = new Book(name, age, gender);
//        // lr.addNewMember(newMember);
    }

    // 성별을 정확히 입력할 떄까지 무한히 입력 받고 정확하면 해당 성별 문자 리턴
    private Gender inputGender() {
        while (true) {
            String gender = si.input("# 성별(M/F) : ");
            if (gender.startsWith("M")) return Gender.MALE;
            if (gender.startsWith("F")) return Gender.FEMALE;
            System.out.println("\n# 성별을 잘못 입력했습니다.");
        }
    }

    // 사용자에게 보여줄 메뉴 화면
    public static void showProgramMenu() {

        System.out.println("\n========= 도서 메뉴 ==========");
        System.out.println("* 1. 마이페이지");
        System.out.println("* 2. 도서 전체 조회");
        System.out.println("* 3. 도서 제목으로 검색");
        System.out.println("* 4. 도서 대여하기");
        System.out.println("* 5. 도서 저자이름으로 검색");
        System.out.println("* 9. 프로그램 종료");

//        String menuNumber = si.input("- 메뉴 번호: ");
//        return menuNumber;
    }

    // 코드의 흐름을 캡슐화
    public void start() {
        showProgramMenu();

        while (true) {
            showProgramMenu();
            String menuNum = si.input("- 메뉴 번호: ");
            switch (menuNum) {
                case "1":
                    userMyPage();
                    break;
                case "2":
                    displayAllBooks();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "9":
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("# 올바른 메뉴 번호를 선택하세요.");
            }
        }
    }

    // 1. 입력한 사용자 정보 뜨는 마이페이지
    private void userMyPage() {

    }

    // 2. 전체 도서 정보 출력
    private void displayAllBooks() {
        System.out.println("\n===================전체 도서 목록====================");
        Book[] informationList = lr.getAllBooksInfo();

        for (Book book : informationList) {
            System.out.println(book.info());
        }

        }
    }

