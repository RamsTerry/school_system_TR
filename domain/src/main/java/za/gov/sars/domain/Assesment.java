/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.gov.sars.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.envers.Audited;

/**
 *
 * @author S2028398
 */
@Entity
@Audited
@Table(name="assesment")
public class Assesment extends BaseEntity{
    
    @Column(name = "assesType")
    private String assesType;
    @Column(name = "releaseDate")
    private String releaseDate;
    @Column(name = "dueDate")
    private String dueDate;
    @Column(name = "submitDate")
    private String submitDate;
    @Column(name = "status")
    private String status;
    @Column(name = "passMark")
    private String passMark;
    @Column(name = "studentMark")
    private String studentMark;
    @Column(name = "totalMark")
    private String totalMark;

    public String getAssesType() {
        return assesType;
    }

    public void setAssesType(String assesType) {
        this.assesType = assesType;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(String submitDate) {
        this.submitDate = submitDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPassMark() {
        return passMark;
    }

    public void setPassMark(String passMark) {
        this.passMark = passMark;
    }

    public String getStudentMark() {
        return studentMark;
    }

    public void setStudentMark(String studentMark) {
        this.studentMark = studentMark;
    }

    public String getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(String totalMark) {
        this.totalMark = totalMark;
    }
    
}
