package com.enriquezrene.part01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by moe on 5/16/16.
 */
public class DeclaringListsJavaStyle {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("watermelon");
        System.out.println(fruits);
    }
}
