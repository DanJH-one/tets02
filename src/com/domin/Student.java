package com.domin;

public class Student {
    private String name;
    private Integer source;
    private Integer bang;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", source=" + source +
                ", bang=" + bang +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getBang() {
        return bang;
    }

    public void setBang(Integer bang) {
        this.bang = bang;
    }

    public Student() {
    }

    public Student(String name, Integer source, Integer bang) {
        this.name = name;
        this.source = source;
        this.bang = bang;
    }
}
