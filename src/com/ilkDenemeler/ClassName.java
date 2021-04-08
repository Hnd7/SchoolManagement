package com.ilkDenemeler;

public enum ClassName {
    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E"),
    F("F"),
    G("G"),
    I("I"),
    K("K");

    private String className;

    ClassName(String className){
        this.className = className;
    }

    public String getClassName() {
        return this.className;
    }
}
