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
public class LicenseProcesses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "licence_processes_id")
    Long id;

    @Column(name = "licence_processes_name")
    String name;
}