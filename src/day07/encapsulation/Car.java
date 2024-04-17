package day07.encapsulation;

public class Car {

    private String model; // 자동차 모델명
    private int speed; // 현재 속도
    private char mode; // 변속 모드
    private boolean start; // 시동이 걸린 여부


    // 생성자 - 자동차가 처음 생성되어 값 세팅
    Car(String model) {
        this.model = model;
        //this.speed = 0; 기본값이어서 없어도 됨.
        this.mode = 'p';
        //this.start = false;
    }

    // 2. 엔진에 연료가 주입되는 기능
    private void injectGasoline() {
        if (start) {
            System.out.println("엔진에 연료가 주입됩니다.");
        } else {
            System.out.println("시동이 켜지지 않았습니다.");
            System.out.println("자동차가 폭발합니다.");
        }
    }

    // 3. 엔진오일이 순환하는 기능
    private void moveEngineOil() {
        System.out.println("엔진오일이 순환합니다.");
    }

    // 4. 엔진 내부에 있는 실린더가 작동하는 기능
    private void moveCylinder() {
        System.out.println("엔진 내부 실린더가 왕복으로 움직입니다.");
    }

    // 1. 시동 버튼을 누르는 기능
    // startStop 메서드만 동작하면 내부 기능 순서대로 진행되도록 !
    void startStop() {
        this.start = !this.start;
        if (start) {
            System.out.println("시동이 켜졌습니다. 운행준비를 시작합니다.");
            injectGasoline();
            moveEngineOil();
            moveCylinder();
        } else {
            System.out.println("시동이 꺼졌습니다. 다음에 봐요.");
        }
    }

    // 현재 속도를 제한하는 메서드
    // 범위 부여 = setter 메서드란 필드값을 안전하게 설정하기 위한 검증로직이 포함된 메서드
    // Main 클래스에서 사용하기 위해 public!
    public void setSpeed(int speed) {
        if (speed < 0 || speed > 200) {
            this.speed = 0;
            this.start = false;
            this.mode = 'p';
            System.out.println("제한 속도 위반으로 시동이 안전하게 꺼졌습니다.");
        } else {
            this.speed = speed;
        }
    }

    // 현재 속도값을 가져오는 메서드
    // getter 메서드란 정보은닉된 필드를 가져오는 대리 메서드
    // 은닉된 필드 사용하기 위한 이름을 get- set- 지어줌.
    public int getSpeed() {
        return this.speed;
    }

    // boolean 필드의 getter 는 이름관례가 다름 is + 필드명
    public boolean isStart() {
        return start;
    }

    public char getMode() {
        return mode;
    }

    public void setMode(char mode) {
        switch (mode) {
            case 'P':
            case 'N':
            case 'D':
            case 'R':
                this.mode = mode;
                break;
            default:
                this.mode = 'P';
        }
    }
}
