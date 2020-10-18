package main.api.dto;


import java.util.Date;
import java.util.UUID;

public class TrainerMeetDTO {
    private UUID trainer;
    private UUID client;
    private Date date;

    public TrainerMeetDTO() {
    }

    public UUID getTrainer() {
        return trainer;
    }

    public UUID getClient() {
        return client;
    }

    public Date getDate() {
        return date;
    }
}
