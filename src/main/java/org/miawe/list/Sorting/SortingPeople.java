package main.java.org.miawe.list.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingPeople {

    private List<People> peopleList;

    public SortingPeople() {
        this.peopleList = new ArrayList<>();
    }

    public void addPeople(String name, int age, double height){
        peopleList.add(new People(name, age, height));
    }

    public List<People> sortingByAge(){
        List<People> peopleByAge = new ArrayList<>(peopleList);
        Collections.sort(peopleByAge);
        return peopleByAge;
    }

    public List<People> sortingByHeight(){
        List<People> peopleByHeight = new ArrayList<>(peopleList);
        peopleByHeight.sort(new ComparatorByHeight());
        return peopleByHeight;
    }
}
