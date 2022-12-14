package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Реализуйте метод, принимающий в качестве
//        аргументов два целочисленных массива, и
//        возвращающий новый массив, каждый элемент которого
//        равен разности элементов двух входящих массивов в
//        той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getResult(null,
                Arrays.asList(2, 7, 9)).toString());
    }

    List<Integer> getResult(List<Integer> list1, List<Integer> list2) {
        if (list1 ==null || list2 == null) {
            throw new MyException("Коллекция из null (не заданы)");
        }
        if (list1.isEmpty() || list2.isEmpty()) {
            throw new IllegalStateException("Значения массива пустые");
        }
        if (list1.size() != list2.size()) {
            throw new IllegalStateException("Длины массивов не равны");
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            result.add(list1.get(i) - list2.get(i));
        }
        return result;
    }
}