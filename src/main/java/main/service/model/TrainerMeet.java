package main.service.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public final class TrainerMeet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private UUID trainer_id;
    private UUID client_id;
    private Date date;

    public TrainerMeet(UUID trainer, UUID client, Date date) {
        this.trainer_id = trainer;
        this.client_id = client;
        this.date = date;
    }

    public TrainerMeet() {
    }

    public UUID getTrainer_id() {
        return trainer_id;
    }

    public UUID getClient_id() {
        return client_id;
    }

    public UUID getId() {
        return id;
    }


    public Date getDate() {
        return date;
    }


}
