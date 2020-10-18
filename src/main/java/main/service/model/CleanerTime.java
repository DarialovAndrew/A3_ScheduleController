package main.service.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public final class CleanerTime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private UUID cleaner;
    private Date date;

    public CleanerTime(UUID cleaner, Date date) {
        this.cleaner = cleaner;
        this.date = date;
    }

    public CleanerTime() {
    }

    public UUID getId() {
        return id;
    }

    public UUID getCleaner() {
        return cleaner;
    }

    public Date getDate() {
        return date;
    }

}
