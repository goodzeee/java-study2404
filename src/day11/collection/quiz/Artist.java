package day11.collection.quiz;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

// 1개의 가수 정보
public class Artist implements Serializable {

    // 가수 필드
    private String artistName;
    private Set<String> songList; // 노래목록 Set = 저장 순서 중요치 않고 중복 제거

    // 생성자
    public Artist(String artistName) {
        this.artistName = artistName;
        this.songList = new HashSet<>(); // 빈 set
    }

    // setter getter
    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Set<String> getSongList() {
        return this.songList;
    }

    public void setSongList(Set<String> songList) {
        this.songList = songList;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistName='" + artistName + '\'' +
                ", songList=" + songList +
                '}';
    }

    public boolean addSong(String songName) {
        return this.songList.add(songName);
    }
}
