package com.preparation;

import java.util.*;
import java.util.stream.Collectors;

public class TestInfo {

    public TestInfo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    private String name;

    public static void main(String[] args) {

//List<TestInfo> list  = Arrays.asList(new TestInfo("kiran",1));
        List<TestInfo> list = new ArrayList<>();
        list.add(new TestInfo("sat",2));
        list.add(new TestInfo("friday",1));
        list.add(new TestInfo("sunday",3));

        Map<Integer, String> collect = list.stream().collect(Collectors.toMap(TestInfo::getId, TestInfo::getName));
        System.out.println(collect);
    }
}
