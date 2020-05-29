package com.company.license.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConclusionsOfAuthorizedStateBody {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "conclusions_of_authorized_state_body_id")
    Long id;

    @Column(name = "conclusions_of_authorized_state_body_name")
    String name;
}