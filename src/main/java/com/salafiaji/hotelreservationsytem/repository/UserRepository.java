package com.salafiaji.hotelreservationsytem.repository;

import com.salafiaji.hotelreservationsytem.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
