package main.api.dto;


import java.util.Date;
import java.util.List;
import java.util.UUID;

public class GroupMeetDTO {
    private List<UUID> clients;
    private UUID trainer;
    private Date date;
    private int maxClients;

    public List<UUID> getClients() {
        return clients;
    }

    public UUID getTrainer() {
        return trainer;
    }

    public Date getDate() {
        return date;
    }

    public int getMaxClients() {
        return maxClients;
    }
}
