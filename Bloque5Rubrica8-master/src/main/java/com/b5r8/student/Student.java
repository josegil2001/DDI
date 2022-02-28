package com.b5r8.student;

public class Student {
    private long id;
    private String name;
    private String passportnumber;

    public Student() {
        super();
    }

    public Student(long id, String name, String passportnumber) {
        super();
        this.id = id;
        this.name = name;
        this.passportnumber = passportnumber;
    }

    public Student(String name, String passportnumber) {
        super();
        this.name = name;
        this.passportnumber = passportnumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportnumber;
    }

    public void setPassportNumber(String passportnumber) {
        this.passportnumber = passportnumber;
    }

    @Override
    public String toString() {
        return String.format("student [id=%s, name=%s, passportnumber=%s]", id, name, passportnumber);
    }
}
