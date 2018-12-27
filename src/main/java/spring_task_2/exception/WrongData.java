package spring_task_2.exception;

public class WrongData extends RuntimeException {
    public WrongData(String message) {
        super(message);
    }
}
