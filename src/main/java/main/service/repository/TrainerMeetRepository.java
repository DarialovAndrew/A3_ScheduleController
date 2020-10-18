package main.service.repository;


import main.service.model.TrainerMeet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainerMeetRepository extends JpaRepository<TrainerMeet, UUID> {
}
