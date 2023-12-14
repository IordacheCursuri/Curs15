package com.itFactory.proiect.model;

import java.util.Objects;

public class Job {

    private int id;
    private String name;
    private String domaine;
    private double baseSalary;

    public Job(int id, String name, String domaine, double baseSalary) {
        this.id = id;
        this.name = name;
        this.domaine = domaine;
        this.baseSalary = baseSalary;
    }

    public Job(){

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

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && Double.compare(baseSalary, job.baseSalary) == 0 && Objects.equals(name, job.name) && Objects.equals(domaine, job.domaine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, domaine, baseSalary);
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", domaine='" + domaine + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
