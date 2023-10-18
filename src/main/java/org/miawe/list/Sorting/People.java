package main.java.org.miawe.list.Sorting;

import java.util.Comparator;

public class People implements Comparable<People>{
    private String name;
    private int age;
    private double height;

    public People(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(People p) {
        return Integer.compare(age, p.getAge());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

class ComparatorByHeight implements Comparator<People>{
    @Override
    public int compare(People p1, People p2) {
        return Double.compare(p1.getHeight(), p2.getHeight());
    }
}
