package day12.io.bytestream;

import day12.io.FileExample;
import java.io.FileNotFoundException;
import java.io.FileOutputStream; // 출
import java.io.IOException;  // 입

// 1byte 로 처리하는 바이트 기반 출력 스트림 예제 - 영상, 이미지, 텍스트 등 모든 데이터 출력
public class FileOutputExample {

    public static void main(String[] args) {
        // 2byte 한글 문자열 => 1byte 바이트 기반으로 처리
        String message = "멍멍이는 멍멍멍!\n 고양이는 애옹쓰~";  // 문자열 데이터를 밖으로 내보냈다면

        // try with resource : close 가 필요한 하드웨어 접근 코드에 대해
        // 메모리 자원 반납처리를 자동화해주는 문법
        // FileOutputStream fos = null;
        // try(close 가 필요한 객체 생성)
        try (FileOutputStream fos = new FileOutputStream(FileExample.ROOT_PATH + "/java/pet.txt")) {
            // fos = new FileOutputStream(FileExample.ROOT_PATH + "/java/pet.txt");
            // 텍스트, 문자열 처리 못함 => 바이트 단위로 getBytes()
            fos.write(message.getBytes()); // 세이브 파일 생성 명령

        } catch (FileNotFoundException e) {
            System.out.println("해당 파일 경로를 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("출력 시스템에 문제가 발생했습니다.");
        }

//        } finally {  // try-catch 마지막에 예외가 나도 실행, 안나도 실행되는 코드
//            // System.out.println("이 코드는 무조건 실행됨 !");
//            // 파일 입출력과 같은 코드는 하드웨어에 직접 접근하는 코드이므로
//            // 보통 사용 후 메모리 정리를 해줘야 다음 실행에 문제가 줄어듬.
//            try {
//                if (fos != null) fos.close();  // fos.close() -> 문 닫아주기 ! 실행해야 되는데 try-catch 로 문제처리
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

    }
}
