package com.salafiaji.hotelreservationsytem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Users {
   private Long id;
   private String firstName;
   private String lastName;
   private String middleName;
   private String bvn;
   @Enumerated(EnumType.STRING)
   private Role role;
   @CreationTimestamp
   private LocalDateTime createdAt;
   private String CreatedBy;
   @UpdateTimestamp
   private LocalDateTime modifiedAt;
   private String modifiedBy;
   private int numberOfLodgings;
   private String email;

}
