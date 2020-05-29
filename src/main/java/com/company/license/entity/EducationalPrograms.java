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
public class EducationalPrograms {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "educational_programs_id")
    Long id;

    @Column(name = "educational_programs_name")
    String name;
}
