package enkripsi;

public class enkripsi_sederhana {

        private static String encrypt(String s){
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String key = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
            String result = "";
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int index = alphabet.indexOf(Character.toUpperCase(c));
                if (index >= 0) {
                    char encryptedChar = key.charAt(index);
                    if (Character.isLowerCase(c)) {
                        encryptedChar = Character.toLowerCase(encryptedChar);
                    }
                    result += encryptedChar;
                } else {
                    result += c;
                }
            }
            return result;
        }
    public static void main(String[] args) {
        System.out.println(encrypt("SEPULSA OKE")); // COZEVCK YUO
        System.out.println(encrypt("ALTERRA ACADEMY")); // KVDOBBK KMKNOWI
        System.out.println(encrypt("INDONESIA")); // SXNYXOCSK
        System.out.println(encrypt("GOLANG")); // QYVKXQ
        System.out.println(encrypt("PROGRAMMER")); // ZBYQBKWWOB
    }

}



