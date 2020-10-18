package main.service.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public final class Cleaner {
    private final String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private int salary;

    public Cleaner(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Cleaner() {
        name = "";
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void clean() {
        System.out.println(this.name + " I am cleaning ");
    }

    public String toString() {
        return this.name + " has salary: " + this.salary + "\n";
    }
}
