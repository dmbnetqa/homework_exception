public class NotFoundException extends RuntimeException {
    public NotFoundException(String sms) {
        super(sms);
    }
}