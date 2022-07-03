package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int indexWord = 0; indexWord < word.length; indexWord++) {
            if (indexWord == pref.length) {
                break;
            }
            for (int indexPref = indexWord; indexPref < pref.length; indexPref++) {
                if (word[indexWord] != pref[indexPref]) {
                    result = false;
                    break;
                } else if (word[indexWord] == pref[indexPref]) {
                    break;
                }
            }
        }
        return result;
    }
}
