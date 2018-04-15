package com.ultimavip.testsomething.testrxjava;

import java.util.List;

/**
 * Created by zhuxing on 2018/4/14.
 */

public class Student {
    List<String> lessons;
    String name;

    public List<String> getLessons () {
        return lessons;
    }

    public void setLessons (List<String> lessons) {
        this.lessons = lessons;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Student (List<String> lessons, String name) {
        this.lessons = lessons;
        this.name = name;
    }
}
