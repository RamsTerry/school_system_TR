/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import org.hibernate.envers.Audited;
import za.gov.sars.common.SchoolType;

/**
 *
 * @author S2028398
 */
@Entity
@Audited
@Table(name="school")
public class School extends BaseEntity{
    @Column(name="name")
    private String name;
    @Column(name="Registration_Name")
    private String registrationName;
    @Enumerated(EnumType.STRING)
    @Column(name = "school_type")
    private SchoolType schoolType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationName() {
        return registrationName;
    }

    public void setRegistrationName(String registrationName) {
        this.registrationName = registrationName;
    }

    public SchoolType getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(SchoolType schoolType) {
        this.schoolType = schoolType;
    }
    
}
