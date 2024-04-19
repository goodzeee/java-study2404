package day09.poly.quiz;

class Processor extends ComputerPart {

    // 상속 받으면 자식에게 생성자 생성 기본 !!
    public Processor(String partName, int partPrice) {
        super(partName, partPrice);
    }

    // 서브 클래스 Processor
        @Override
        public void describePart() {
            System.out.println("Processor: " + partName + ", Price: " + partPrice);
        }
    }
