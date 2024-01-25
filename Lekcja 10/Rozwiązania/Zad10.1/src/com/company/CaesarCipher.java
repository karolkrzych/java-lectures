package com.company;

public class CaesarCipher {

    private int shift;
    private char[] chars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'Ł', 'M', 'N', 'Ń', 'O', 'P',
            'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Ź', 'Ż'};
    /*    private final String alphabet = "ABCDEFGHIJKLŁMNŃOPRSTUVWXYZŹŻ";*/

    public CaesarCipher(int shift) {
        this.shift = shift;
    }

    public String encrypt(String toEncrypt) {
        String afterEncrypt = "";
        for (int i = 0; i < toEncrypt.length(); i++) {
            char ch = toEncrypt.charAt(i);
            afterEncrypt += encrypt(ch);
        }
        return afterEncrypt;

    }

    public String decrypt(String toEncrypt) {
        shift = shift * -1;
        return encrypt(toEncrypt);
    }

/*    private char encrypt(char ch) {
        int index = alphabet.indexOf(ch) + shift % alphabet.length();
        try {
            return alphabet.charAt(index);
        } catch (StringIndexOutOfBoundsException e) {
            return alphabet.charAt((shift > 0 ? 0 : alphabet.length()) + index % alphabet.length());
        }
    }*/

    private char encrypt(char ch) {
        int index = 0;
        try {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ch) {
                    index = i + shift % chars.length;
                    return chars[index];
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return chars[(shift > 0 ? 0 : chars.length) + index % chars.length];
        }
        return ch;
    }
}
