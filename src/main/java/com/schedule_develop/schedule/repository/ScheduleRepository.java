package com.schedule_develop.schedule.repository;

import com.schedule_develop.schedule.entity.ScheduleDevelop;
import com.schedule_develop.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<ScheduleDevelop, Long> {

    List<ScheduleDevelop> findAllByUser(User userName);
}
