//ALBA
//package service;
//
//import javax.crypto.Cipher;
//import javax.crypto.KeyGenerator;
//import javax.crypto.SecretKey;
//import javax.crypto.spec.SecretKeySpec;
//import java.util.Base64;
//
//public class AESService {
//    private final String ALGORITHM = "AES";
//    private final SecretKey secretKey;
//
//    public AESService(String key) {
//        secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
//    }
//
//    public String encrypt(String data) throws Exception {
//        Cipher cipher = Cipher.getInstance(ALGORITHM);
//        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
//        return Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes()));
//    }
//
//    public String decrypt(String encryptedData) throws Exception {
//        Cipher cipher = Cipher.getInstance(ALGORITHM);
//        cipher.init(Cipher.DECRYPT_MODE, secretKey);
//        return new String(cipher.doFinal(Base64.getDecoder().decode(encryptedData)));
//    }
//}
