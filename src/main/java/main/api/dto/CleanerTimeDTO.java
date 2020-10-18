package main.api.dto;


import java.util.Date;
import java.util.UUID;

public class CleanerTimeDTO {
    private UUID cleaner;
    private Date date;

    public UUID getCleaner() {
        return cleaner;
    }

    public Date getDate() {
        return date;
    }
}
