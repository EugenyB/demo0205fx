package ua.mk.berkut.demo0205fx.model;

public class Student {
    private final int id;
    private String name;
    private int age;
    private double rating;

    public Student(int id, String name, int age, double rating) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
