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
public class LicenseType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "licence_type_id")
    Long id;

    @Column(name = "licence_type_name")
    String name;

}
