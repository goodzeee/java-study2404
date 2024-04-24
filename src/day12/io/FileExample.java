package day12.io;

import java.io.File;
import java.io.IOException;

public class FileExample {

    // 파일을 저장할 기본 경로 지정
    public static final String ROOT_PATH = "D:/";

    public static void main(String[] args) {
        // 폴더 생성 명령
        // 파일 정보 객체 생성 - 폴더 이름 지정
        File directory = new File(ROOT_PATH + "/java");
        // 폴더 생성 - mkdir()
        if (!directory.exists()) directory.mkdir();  // 위 생성한 객체 폴더가 존재하지 않는다면 mkdir 생성 !

        // 파일 생성 - createNewFile()
        File newFile = new File(ROOT_PATH + "/java/io.txt"); //만든 폴더 경로 다음에 파일 txt 생성
        if (!newFile.exists()) {
            try {
                newFile.createNewFile(); // createNewFile() -> 부모로 throws 던져주는 클래스 존재
            } catch (IOException e) {   // 예외처리 이 문제가 캐치되면 실행될 것
                System.out.println("파일 생성에 실패했습니다,");
            }
        }

    }
}
