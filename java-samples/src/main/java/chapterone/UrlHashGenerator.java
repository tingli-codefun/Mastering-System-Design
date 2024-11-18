package chapterone;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class UrlHashGenerator {
    public String generateHashMd5(String url) {
        try {
            // Create MD5 hash
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(url.getBytes());
            byte[] digest = md.digest();

            // Convert byte array to hex string
            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            // Take the first 7 digits of the hex string
            String fullHashString = hexString.toString();
            String sevenDigitHash = fullHashString.substring(0, 7);

            // Convert to integer and ensure it's 7 digits
            int hashCode = Integer.parseInt(sevenDigitHash, 16);
            return String.format("%07d", hashCode % 10000000);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String generateHashSha256(String url) {
        try {
            // Create SHA-256 hash
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(url.getBytes());
            byte[] digest = md.digest();

            // Convert byte array to Base64 string
            String base64 = Base64.getUrlEncoder().encodeToString(digest);

            // Remove any non-alphanumeric characters
            base64 = base64.replaceAll("[^a-zA-Z0-9]", "");

            // Take the first 7 characters
            return base64.substring(0, 7);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
