package day11.collection.quiz;

import day12.io.FileExample;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 가수 객체 여러 개를 관리 (조회, 수정, 삭제, 생성 ...)
public class ArtistRepository {

    // 가수들을 담을 자료구조 선언
    // key : 가수이름, value : 가수 객체 (가수명, 노래리스트 )
    private Map<String, Artist> artistMap = new HashMap<>();

    // 세이브 파일 위치 경로 지정
    public static final String SAVE_PATH = FileExample.ROOT_PATH + "/java/song.txt";

    // 가수 정보 생성 ..

    public int count() {
        return artistMap.size();
    }

    public boolean isRegistered(String artistName) {
        return artistMap.containsKey(artistName);
    }

    public void addNewArtist(String artistName, String songName) {
        // 주어진 정보를 map 에 저장
        Artist newArtist = new Artist(artistName); // 신규 가수 객체 생성
        // 첫번쨰 노래 songList 에 추가
        newArtist.addSong(songName);
        artistMap.put(artistName, newArtist);
    }

    public boolean addNewSong(String artistName, String songName) {
        // map에서 기존 가수 정보 가져오기
        Artist foundArtist = artistMap.get(artistName);
        // 이 가수의 노래리스트에 새노래를 추가해준다.
        return foundArtist.addSong(songName);
    }

    public Set<String> getSongList(String artistName) {
        // map에서 기존 가수 정보 가져오기
        Artist foundArtist = artistMap.get(artistName);
        return foundArtist.getSongList();
    }

    public void save() {
        // 입력한 내용을 세이브 파일 만들어서 거기다 넣어주기
        try (FileOutputStream fos = new FileOutputStream(SAVE_PATH)){

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(artistMap);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void load() {
        // 다시 실행시켜도 저장된 내용 유지되어 있게 해줘 !!
        File file = new File(SAVE_PATH);
        if (file.exists()) {  // 이 파일이 존재하면 실행시켜라 ~
            try (FileInputStream fis = new FileInputStream(SAVE_PATH)) {
                ObjectInputStream ois = new ObjectInputStream(fis);
                this.artistMap = (Map<String, Artist>) ois.readObject();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // 가수 정보 탐색 .. 로직
}
