package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int count = 0;
        for (int indexWord = word.length - 1; indexWord >= 0; indexWord--) {
            if (indexWord == post.length) {
                break;
            }
            for (int indexPost = post.length - 1 - count; indexPost >= 0; indexPost--) {
                count++;
                if (word[indexWord] != post[indexPost]) {
                    result = false;
                    break;
                } else if (word[indexWord] == post[indexPost]) {
                    break;
                }
            }
        }
        return result;
    }
}
