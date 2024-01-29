package com.salafiaji.hotelreservationsytem.repository;

import com.salafiaji.hotelreservationsytem.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
