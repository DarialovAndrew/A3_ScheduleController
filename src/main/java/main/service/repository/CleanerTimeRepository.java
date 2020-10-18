package main.service.repository;


import main.service.model.CleanerTime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CleanerTimeRepository extends JpaRepository<CleanerTime, UUID> {
}
