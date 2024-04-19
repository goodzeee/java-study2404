package day09.poly.quiz;

class HardDrive extends ComputerPart {
    public HardDrive(String partName, int partPrice) {
        super(partName, partPrice);
    }

    // 서브 클래스 HardDrive
        @Override
        public void describePart() {
            System.out.println("Hard Drive: " + partName + ", Price: " + partPrice);
        }
    }
