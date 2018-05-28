package com.company.inheritance;

public class Child extends Parent {

    private String childField;

    public Child(String field, String childField) {
        super(field);
        this.childField = childField;
    }

    public String getChildField() {
        return childField;
    }

    public void setChildField(String childField) {
        this.childField = childField;
    }
}
