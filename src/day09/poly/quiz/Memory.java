package day09.poly.quiz;

class Memory extends ComputerPart {
    public Memory(String partName, int partPrice) {
        super(partName, partPrice);
    }

    // 서브 클래스 Memory
        @Override
        public void describePart() {
            System.out.println("Memory: " + partName + ", Price: " + partPrice);
        }
    }

