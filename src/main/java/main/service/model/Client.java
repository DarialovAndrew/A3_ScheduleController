package main.service.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public final class Client {
    private final String name;
    private final boolean VIP;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private boolean present;

    public Client(String name, boolean present, boolean VIP) {
        this.name = name;
        this.present = present;
        this.VIP = VIP;
    }

    public Client() {
        name = "";
        VIP = false;
    }

    public UUID getId() {
        return id;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public String getName() {
        return name;
    }

    public void train() {
        System.out.println(this.name + " I am training");
    }

    public String toString() {
        return this.name + " present: " + this.present + " VIP: " + this.VIP + "\n";
    }
}
