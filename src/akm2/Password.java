package akm2;

public final class Password {
    private static final int KEY = 51478923;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encrypt(password);
    }

    public int getEncryptedPassword() {
        return encryptedPassword;
    }

    public final int encrypt(int password){
        return password ^ KEY;
    }
}
