import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ProofOfReserves {

    public final static void main(String[] args) throws Exception {
        String hash = hashFunc("1001","btc","10.12345678","184215605502167040");
        System.out.println(hash);
    }

    public static String hashFunc(String userId, String currencyName, String balance, String nonce) throws Exception {
        String hashString = userId + "&" + currencyName + "&" + balance + "&" + nonce;
        return sha256Hex(hashString);
    }

    public static String sha256Hex(String originalString) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedhash = digest.digest(
                originalString.getBytes(StandardCharsets.UTF_8));
        return bytesToHex(encodedhash);
    }

    private static String bytesToHex(byte[] hash) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
    
}
