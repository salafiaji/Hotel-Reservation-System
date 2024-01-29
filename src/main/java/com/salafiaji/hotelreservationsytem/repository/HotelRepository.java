package com.salafiaji.hotelreservationsytem.repository;

import com.salafiaji.hotelreservationsytem.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
