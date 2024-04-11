package com.example.day08;

public final class SecurityConfig {
    private static final String ENCRYPTION_KEY = "test!123";

    private SecurityConfig() {
        // 생성자를 private로 선언하여 외부에서 인스턴스화 방지
    }

    public static String getEncryptionKey() {
        return ENCRYPTION_KEY;
    }

    public static void main(String[] args) {
        String encryptionKey = SecurityConfig.getEncryptionKey();
        System.out.println(encryptionKey);
    }
}
