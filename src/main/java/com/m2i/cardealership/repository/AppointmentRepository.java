package com.m2i.cardealership.repository;

import com.m2i.cardealership.entity.Appointment;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {
}
