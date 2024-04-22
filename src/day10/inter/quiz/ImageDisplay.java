package day10.inter.quiz;

public class ImageDisplay implements MediaPlayable {
    @Override
    public void play() {
        System.out.println("이미지가 재생됩니다.");
    }

    @Override
    public void pause() {
        System.out.println("이미지가 일시 정지됩니다.");
    }

    @Override
    public void stop() {
        System.out.println("이미지가 재생 중지됩니다.");
    }
}
