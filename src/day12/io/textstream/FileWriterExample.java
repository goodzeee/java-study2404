package day12.io.textstream;

import day12.io.FileExample;
import util.SimpleInput;

import java.io.FileWriter;
import java.io.IOException;

// 텍스트 기반 스트림 : 텍스트 입출력에 특화된 스트림으로 2byte 이상 데이터 처리 기능
public class FileWriterExample {

    // 1byte 바이트 기반 스트림 : OutputStream, InputStream
    // 2byte 텍스트 기반 스트림 : Writer, Reader

    public static void main(String[] args) {

        String targetPath = FileExample.ROOT_PATH + "/java/hobby.txt";

        // 텍스트 기반이라 처리하기 간편 !
        // 파일 입출력할 때 ! 꼭 하기 + finally 에서 close 하는 거 처리 !
        try (FileWriter fw = new FileWriter(targetPath)) {
            String hobby = SimpleInput.input("취미를 입력하세요.\n>> ");
            String outputMessage = String.format("내 취미는 %s입니다.\n ", hobby);
            // 파일 생성 명령
            fw.write(outputMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
