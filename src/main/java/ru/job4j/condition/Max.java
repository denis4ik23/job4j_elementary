package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static int max(int left, int right, int third) {
        int maximum = max(left, right);
        int result = third >= maximum ? third : maximum;
        return result;
    }

    public static int max(int left, int right, int third, int fourth) {
        int maximum = max(left, right, third);
        int result = fourth >= maximum ? fourth : maximum;
        return result;
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
