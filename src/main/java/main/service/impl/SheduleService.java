package main.service.impl;


import main.service.model.CleanerTime;
import main.service.model.GroupMeet;
import main.service.model.TrainerMeet;
import main.service.repository.CleanerTimeRepository;
import main.service.repository.GroupMeetRepository;
import main.service.repository.TrainerMeetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public final class SheduleService {
    private CleanerTimeRepository cleanerTimes;
    private TrainerMeetRepository trainerMeets;
    private GroupMeetRepository groupMeets;

    @Autowired
    public SheduleService(CleanerTimeRepository a, TrainerMeetRepository b, GroupMeetRepository c) {
        this.cleanerTimes = a;
        this.trainerMeets = b;
        this.groupMeets = c;
    }


    public void add(CleanerTime time) {
        cleanerTimes.save(time);
    }

    public void add(TrainerMeet time) {
        trainerMeets.save(time);
    }

    public void add(GroupMeet time) {
        groupMeets.save(time);
    }

    public void deleteCleanerTime(UUID id) {
        cleanerTimes.deleteById(id);
    }

    public void deleteTrainerMeet(UUID id) {
        trainerMeets.deleteById(id);
    }

    public void deleteGroupMeet(UUID id) {
        groupMeets.deleteById(id);
    }

    public CleanerTimeRepository getCleanerTimes() {
        return cleanerTimes;
    }

    public TrainerMeetRepository getTrainerMeets() {
        return trainerMeets;
    }

    public GroupMeetRepository getGroupMeets() {
        return groupMeets;
    }

    public String toString() {
        return "\nGroupMeetings: " + this.groupMeets.toString() + "\nTrainerMeetings: " + this.trainerMeets.toString() + "\nCleanerTime: " + this.cleanerTimes.toString() + "\n";
    }

}
