package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static int max(int left, int right, int third) {
        return max(max(left, right), third);
    }

    public static int max(int left, int right, int third, int fourth) {
        return max(max(left, right), max(third, fourth));
    }

    public static void main(String[] args) {
        int value = Max.max(3, 42);
        int value1 = Max.max(10, 12, 4);
        int value2 = Max.max(13, 52, 31, 85);
        System.out.println(value);
        System.out.println(value1);
        System.out.println(value2);
    }
}
