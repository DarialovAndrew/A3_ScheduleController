package main.service.repository;

import main.service.model.GroupMeet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GroupMeetRepository extends JpaRepository<GroupMeet, UUID> {
}
