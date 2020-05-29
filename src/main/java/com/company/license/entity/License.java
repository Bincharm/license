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
public class License {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "license_id")
    Long id;

    @Column
    Integer licenseNumber;

    @Column
    String licenseTitleKg;

    @Column
    String licenseTitleRu;

    @Column
    String licenseFullTitleEn;

    @Column
    String licenseTitleShort;

    @ManyToOne
    @JoinColumn(name = "institutional_legal_form_id")
    InstitutionalLegalForm institutionalLegalForm;

    @Column
    String legalAddress;

    @Column
    String actualAddress;

    @Column
    Integer taxpayerIdentificationNumber;

    @Column
    Integer phoneNumber;

    @Column
    String emailAddress;

    @Column
    String charterNumber;

    @Column
    String stateRegistrationCertificate;

    @ManyToOne
    @JoinColumn(name = "license_type_id")
    LicenseType licenseType;

    @ManyToOne
    @JoinColumn(name = "educational_programs_id")
    EducationalPrograms educationalPrograms;

    @ManyToOne
    @JoinColumn(name = "conclusions_of_authorized_state_body_id")
    ConclusionsOfAuthorizedStateBody conclusionsOfAuthorizedStateBody;
}
