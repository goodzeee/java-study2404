package day12.io.bytestream;

import day12.io.FileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 1byte 로 처리하는 바이트 기반 출력 스트림 예제 - 영상, 이미지, 텍스트 등 모든 데이터 출력
public class FileInputExample {

    public static void main(String[] args) {
        // 저장된 파일에 텍스트를 읽어온다.

        try (FileInputStream fis = new FileInputStream(FileExample.ROOT_PATH + "/java/pet.txt")) {

            int data = 0;// 세이브 파일 로드 명령
            while ((data = fis.read()) != -1) {  // read() -> -1이 될 때까지 파일 내용 출력되도록 반복되는 코드임.
                // data = fis.read();
                // 아스키코드를 문자로 출력하는 문
                System.out.write(data);
            }
            // 출력 버퍼 비우기 (일부만 채워져도 다 나오게 해주는)
            System.out.flush();

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
