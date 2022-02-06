package Labo_18.b;

import java.util.Objects;

public class User {
    private  String firstName;
    private  String sureName;
    private  int age;

    public User(String firstName, String sureName, int age) {
        this.firstName = firstName;
        this.sureName = sureName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(firstName, user.firstName) && Objects.equals(sureName, user.sureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, sureName, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", sureName='" + sureName + '\'' +
                ", age=" + age +
                '}';
    }
}
