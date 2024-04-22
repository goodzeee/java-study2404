package day10.exception;

public class InvalidLoginInputException extends Exception {
    
    // 자바가 잡지 못한 예외 상속 받아서 내가 만들기 !
    public InvalidLoginInputException() {
        
    }
    public InvalidLoginInputException(String message) {
        super(message);
    }
}
