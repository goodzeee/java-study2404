package day09.poly.quiz;

public abstract class Computer {
    // 부품 관리 클래스 Computer
        private ComputerPart[] parts;

        public Computer() {
            this.parts = new ComputerPart[0];
        }

        public void addPart(ComputerPart part) {
            // ComputerPart[] 에 부품 추가
        }

        public void showParts() {
            // 모든 부품 정보 출력
        }

    // 서브 클래스 Processor
        public abstract void describePart();
}
