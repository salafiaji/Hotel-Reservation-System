package com.salafiaji.hotelreservationsytem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roomNo;
    private String roomAlias;
    private LocalDateTime bookedAt;
    private int lodgingHours;
    private LocalDateTime exitTime;
    private double price;
    @CreationTimestamp
    private LocalDateTime createdAt;
    private String CreatedBy;
    @UpdateTimestamp
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
