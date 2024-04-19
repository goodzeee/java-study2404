package day09.poly.quiz;

class ComputerPart {
    // 기본 클래스 ComputerPart
        protected String partName;
        protected int partPrice;

        // 부모가 자식이 만든 생성자에 값을 넣어줌
        public ComputerPart(String partName, int partPrice) {
            this.partName = partName;
            this.partPrice = partPrice;
        }

        public void describePart() {
            System.out.println("Part: " + partName + ", Price: " + partPrice);
        }


}
