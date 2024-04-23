package day11.collection.quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 가수 객체 여러 개를 관리 (조회, 수정, 삭제, 생성 ...)
public class ArtistRepository {

    // 가수들을 담을 자료구조 선언
    // key : 가수이름, value : 가수 객체 (가수명, 노래리스트 )
    private Map<String, Artist> artistMap = new HashMap<>();


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

    // 가수 정보 탐색 .. 로직
}
