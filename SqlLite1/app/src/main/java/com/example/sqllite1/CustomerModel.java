package com.example.sqllite1;

public class CustomerModel {
    private String name;
    private int age;
    private int id;
    private boolean isActive;

    public CustomerModel(String name, int age, int id, boolean isActive) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", isActive=" + isActive +
                '}';
    }

}
