package day11.collection.quiz;

import java.util.Map;
import java.util.Set;

import static util.SimpleInput.*;

// 프로그램 입출력 처리 담당
public class ArtistView {

    // 저장된 정보들 가져오게
    private static ArtistRepository repository = new ArtistRepository();

    // 메뉴를 출력해주는 기능
    public static void showMenu() {
        System.out.println("\n*************** 음악 관리 프로그램 **************");
        System.out.printf("# 현재 등록된 가수 : %d명\n", repository.count());
        System.out.println("# 1. 노래 등록하기");
        System.out.println("# 2. 노래 정보 검색");
        System.out.println("# 3. 프로그램 종료");
        System.out.println("=======================================");
        }

    // 프로그램 실행
        public static void start() {

        while (true) {
            showMenu();
            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    addMusic();
                    break;
                case "2":
                    searchMusicInfo();
                    break;
                case "3":
                    System.out.println("# 프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("# 올바른 메뉴 번호를 입력하세요.");
            }
        }
    }

    // 1 노래 등록하는 기능
    private static void addMusic() {
        System.out.println("# 노래 등록을 시작합니다.");
        String artistName = input("- 가수명 : ");
        String songName = input("- 노래명 : ");

        // 결과 화면 출력
        if (!repository.isRegistered(artistName)) { // 신규 등록 가수인가???
            repository.addNewArtist(artistName, songName); // 신규 등록된 노래 정보 저장시키기
            System.out.printf("\n# %s님이 신규등록되었습니다.\n", artistName);
        } else { // 신규 등록이 아니라 기존 등록 가수에 곡명만 추가하는 것인가?
            // 기존 가수 새로운 노래를 등록한다. 추가가 잘되었는지 여부 확인 !
            boolean flag = repository.addNewSong(artistName, songName);
            if (flag) { // 기존 가수의 트랙리스트에 노래만 추가하는 경우
                System.out.printf("\n# %s님이 노래목록에 %s곡이 추가되었습니다.\n", artistName, songName);
            } else {   // 노래가 중복된 경우
                System.out.printf("\n# [%s]곡은 이미 등록된 노래입니다.\n", songName);
            }
        }
    }

    // 2 노래 정보 검색
    private static void searchMusicInfo() {
        System.out.println("\n# 검색할 가수명을 입력하세요.");
        String artistName = input("- 가수명: ");

        if (repository.isRegistered(artistName)) { // 검색한 가수가 저장되어 있다면
            // 노래목록 가져와 출력하게~~
            Set<String> songList = repository.getSongList(artistName);

            int num = 1;
            System.out.printf("\n# %s님의 노래목록 \n", artistName);
            for (String song : songList) {
                System.out.println("==============================");
                System.out.printf("# %d. %s\n", num++, song);
            }

        } else {
            System.out.println("\n# 해당 가수는 등록되지 않았습니다.");
        }
    }
}
