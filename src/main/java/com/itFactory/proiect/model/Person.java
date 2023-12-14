package com.itFactory.proiect.model;

import java.util.Objects;

public class Person {

    private int id;
    private String name;
    private String email;
    private double salaryIndex;
    private int jobId;

    public Person(int id, String name, String email, double salaryIndex, int jobId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salaryIndex = salaryIndex;
        this.jobId = jobId;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalaryIndex() {
        return salaryIndex;
    }

    public void setSalaryIndex(double salaryIndex) {
        this.salaryIndex = salaryIndex;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Double.compare(salaryIndex, person.salaryIndex) == 0 && jobId == person.jobId && Objects.equals(name, person.name) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, salaryIndex, jobId);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salaryIndex=" + salaryIndex +
                ", jobId=" + jobId +
                '}';
    }
}
