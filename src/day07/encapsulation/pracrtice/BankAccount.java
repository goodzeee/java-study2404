package day07.encapsulation.pracrtice;

class BankAccount {
    // 필드
    private String accountNumber;  // 계좌 번호
    private String accountHolder;  // 주인 이름
    private int balance;

    // 생성자
    BankAccount(String accountNumber, String accountHolder, int balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    // 잔액 조회 메서드
    public int getBalance() {
        return balance;
    }

    // 입금 메서드
    public void deposit(int i) {
        if (i < 0) {
            System.out.println("입금액이 음수일 수 없습니다.");
            return;
        }
        this.balance += i;
    }

    // 출금 메서드
    public void withdraw(int i) {
        if (this.balance > i || i < 0) {
            this.balance -= i;
        } else {
            System.out.println("\n잔액이 부족하여 출금할 수 없습니다.");
        }
    }

}
