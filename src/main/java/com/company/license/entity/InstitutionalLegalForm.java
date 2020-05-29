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
public class InstitutionalLegalForm {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "institutional_legal_form_id")
    Long id;

    @Column(name = "institutional_legal_form_title")
    String name;
}
