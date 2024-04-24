package day12.io.obj;

import day12.io.FileExample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SaveSnack {

    public static void main(String[] args) {

        // 세이브 파일에 넣을 것
        List<Snack> snackList = List.of(new Snack("콘칲", 1970, 1500, Snack.Taste.SOSO)
        ,new Snack("포카칩", 1980, 1700, Snack.Taste.GOOD)
        ,new Snack("에이스", 1965, 1300, Snack.Taste.BAD));

        // List 객체 자체를 통째로 세이브 파일로 사용하면 ??
        // 바이트 기반 텍스트 사용 fileOutputStream
        try (FileOutputStream fos = new FileOutputStream(FileExample.ROOT_PATH + "/java/snack.txt")){
            // 객체를 통째로 저장할 수 있는 보조 스트림
            // serialize : 직렬화 - 데이터를 일렬로 늘여뜨려 놓는 것
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(snackList);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
