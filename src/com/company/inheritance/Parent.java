package com.company.inheritance;

import java.io.Serializable;

public class Parent implements Serializable {


    private String field;

    public Parent(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "field='" + field + '\'' +
                '}';
    }
}
