package com.schedule_develop.repository;

import com.schedule_develop.entity.ScheduleDevelop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<ScheduleDevelop, Long> {

    List<ScheduleDevelop> findAllByName(String scheduleName);
}
